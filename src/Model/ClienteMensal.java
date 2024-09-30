package Model;

import java.time.Duration;
import java.time.LocalDateTime;

public class ClienteMensal extends Cliente {
    private LocalDateTime prazoSaida;

    public ClienteMensal(String nome, String contacto, String residencia, String matricula, String corCarro, double valorPorHora, String tipoPagamento, LocalDateTime prazoSaida) {
        super(nome, contacto, residencia, matricula, corCarro, valorPorHora, tipoPagamento);
        this.prazoSaida = prazoSaida;
    }

    @Override
    public double calcularValorTotal() {
        if (dataHoraSaida == null) {
            dataHoraSaida = LocalDateTime.now();
        }

        long horas = Duration.between(dataHoraEntrada, dataHoraSaida).toHours();

        double valorTotal = horas * valorPorHora;

        // Se o cliente exceder o prazo, aplica multa de 10%
        if (dataHoraSaida.isAfter(prazoSaida)) {
            valorTotal += valorTotal * 0.10; // 10% de multa
        }

        return valorTotal;
    }

    public LocalDateTime getPrazoSaida() {
        return prazoSaida;
    }

    public void setPrazoSaida(LocalDateTime prazoSaida) {
        this.prazoSaida = prazoSaida;
    }

    @Override
    public String exibirDetalhes() {
        return String.format("ID Cliente: %d\nNome: %s\nContacto: %s\nResidência: %s\nMatrícula: %s\nCor do Carro: %s\nValor por Hora: %.2f\nTipo de Pagamento: %s\nEstacionado: %s\nHora de Entrada: %s\nPrazo de Saída: %s\n",
            idCliente, getNome(), getContacto(), getResidencia(), matricula, corCarro, valorPorHora, getTipoPagamento(), (estacionado ? "Sim" : "Não"), dataHoraEntrada.toString(), prazoSaida.toString()
        );
    }
}
