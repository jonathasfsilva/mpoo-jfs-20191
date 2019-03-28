import java.util.Date;

public class Professor extends Pessoa{
    private Date admissao;
    private Endereco endereco;

    public Date getAdmissao() {
        return admissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }
}
