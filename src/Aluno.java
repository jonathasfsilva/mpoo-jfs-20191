public class Aluno extends Pessoa{
    private int anoEntrada;
    private int periodoEntrada;
    private Endereco endereco;

    public int getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    public int getPeriodoEntrada() {
        return periodoEntrada;
    }

    public void setPeriodoEntrada(int periodoEntrada) {
        this.periodoEntrada = periodoEntrada;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
