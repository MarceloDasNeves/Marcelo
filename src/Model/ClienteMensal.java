package Model;

import java.time.Duration;
import java.time.LocalDateTime;

public class ClienteMensal extends Cliente {
    private LocalDateTime prazoSaida;

    public ClienteMensal(String nome, String contacto, String residencia, Veiculo veiculo, String tipoPagamento, LocalDateTime prazoSaida) {
        super(nome, contacto, residencia, veiculo, tipoPagamento);
        this.prazoSaida = prazoSaida;
    }

@Override
public double calcularValorTotal() {
    if (getDataHoraSaida() == null) {
        setDataHoraSaida(LocalDateTime.now());
    }

    long horas = Duration.between(getDataHoraEntrada(), getDataHoraSaida()).toHours();
    double valorTotal = horas * getVeiculo().getValorPorHora();

    // Se o cliente exceder o prazo, aplica multa de 10%
    if (getDataHoraSaida().isAfter(prazoSaida)) {
        valorTotal += valorTotal * 0.10; // Aplica 10% de multa
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
        return String.format(
            "ID Cliente: %d\nNome: %s\nContacto: %s\nResidência: %s\nMatrícula: %s\nCor do Carro: %s\nValor por Hora: %.2f\nTipo de Pagamento: %s\nEstacionado: %s\nHora de Entrada: %s\nPrazo de Saída: %s\n",
            getIdCliente(), getNome(), getContacto(), getResidencia(), getVeiculo().getMatricula(),
            getVeiculo().getCorCarro(), getVeiculo().getValorPorHora(), getTipoPagamento(),
            (isEstacionado() ? "Sim" : "Não"), getDataHoraEntrada().toString(), prazoSaida.toString()
        );
    }
}
