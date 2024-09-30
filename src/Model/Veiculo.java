
package Model;

public class Veiculo {
    private String matricula;
    private String corCarro;
    private double valorPorHora;

    public Veiculo(String matricula, String corCarro, double valorPorHora) {
        this.matricula = matricula;
        this.corCarro = corCarro;
        this.valorPorHora = valorPorHora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return String.format("Matrícula: %s\nCor do Carro: %s\nValor por Hora: %.2f", matricula, corCarro, valorPorHora);
    }
}
