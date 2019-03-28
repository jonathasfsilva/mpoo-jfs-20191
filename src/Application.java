public class Application {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Endereco enderecoProfessor = new Endereco();
        Aluno aluno = new Aluno();
        Endereco enderecoAluno = new Endereco();

        professor.setNome("Gabriel Alves");
        professor.setCpf("123.123.123-00");
        enderecoProfessor.setCidade("Recife");
        enderecoProfessor.setRua("Rua Transversal");
        enderecoProfessor.setNumero(13);
        enderecoProfessor.setComplemento("prox ao Parque");
        //professor.setAdmissao("01/02/2022");
        professor.setEndereco(enderecoProfessor);

        aluno.setNome("Jonathas F. Silva");
        aluno.setCpf("987.654.321-01");
        aluno.setAnoEntrada(2017);
        aluno.setPeriodoEntrada(2);
        enderecoAluno.setCidade("Vitoria");
        enderecoAluno.setRua("Sao Jose");
        enderecoAluno.setNumero(45);
        enderecoAluno.setComplemento("A");
    }
}
