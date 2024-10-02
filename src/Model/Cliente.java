package Model;

import java.time.LocalDateTime;

public class Cliente extends Pessoa {
    private static int idCounter = 1;
    private int idCliente;
    private String tipoPagamento;  // "mensal" ou "temporário"
    private boolean estacionado;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private int espacoEstacionado;
    private Veiculo veiculo;

    public Cliente(String nome, String contacto, String residencia, Veiculo veiculo, String tipoPagamento) {
        super(nome, contacto, residencia);
        this.idCliente = idCounter++;
        this.veiculo = veiculo;
        this.tipoPagamento = tipoPagamento;
        this.estacionado = true;
        this.dataHoraEntrada = LocalDateTime.now();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public int getEspacoEstacionado() {
        return espacoEstacionado;
    }

    public void setEspacoEstacionado(int espacoEstacionado) {
        this.espacoEstacionado = espacoEstacionado;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void registrarSaida() {
        if (estacionado) {
            this.dataHoraSaida = LocalDateTime.now();
            this.estacionado = false;
        } else {
            System.out.println("O veículo já foi removido.");
        }
    }

    public double calcularValorTotal() {
        if (dataHoraSaida == null) {
            dataHoraSaida = LocalDateTime.now();
        }

        long horas = java.time.Duration.between(dataHoraEntrada, dataHoraSaida).toHours();
        long minutos = java.time.Duration.between(dataHoraEntrada, dataHoraSaida).toMinutesPart();

        if (minutos > 0) {
            horas++;
        }

        return horas * veiculo.getValorPorHora();
    }

    @Override
    public String exibirDetalhes() {
        return String.format(
            "ID Cliente: %d\nNome: %s\nContacto: %s\nResidência: %s\nMatrícula: %s\nCor do Carro: %s\nValor por Hora: %.2f\nTipo de Pagamento: %s\nEstacionado: %s\nHora de Entrada: %s\nEspaço Estacionado: %d\n",
            idCliente, getNome(), getContacto(), getResidencia(), veiculo.getMatricula(), veiculo.getCorCarro(), veiculo.getValorPorHora(),
            tipoPagamento, (estacionado ? "Sim" : "Não"), dataHoraEntrada.toString(), espacoEstacionado
        );
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
}
