public class Application {
    public static void main(String[] args) {

        /*
        * Professor e Aluno tem mais um atributo que eh endereco que eh um obj da classe Endereco
        *
        * */

        Professor professor = new Professor();
        Endereco enderecoProfessor = new Endereco();
        Aluno aluno = new Aluno();
        Endereco enderecoAluno = new Endereco();

        //Cricao de obj professor e seu endereco
        professor.setNome("Gabriel Alves");
        professor.setCpf("123.123.123-00");
        enderecoProfessor.setCidade("Recife");
        enderecoProfessor.setRua("Rua Transversal");
        enderecoProfessor.setNumero(13);
        enderecoProfessor.setComplemento("prox ao Parque");
        //professor.setAdmissao("01/02/2022");
        professor.setEndereco(enderecoProfessor);

        //Criacao de obj aluno e seu endereco
        aluno.setNome("Jonathas F. Silva");
        aluno.setCpf("987.654.321-01");
        aluno.setAnoEntrada(2017);
        aluno.setPeriodoEntrada(2);
        enderecoAluno.setCidade("Vitoria");
        enderecoAluno.setRua("Rua Sao Jose");
        enderecoAluno.setNumero(45);
        enderecoAluno.setComplemento("A");
        aluno.setEndereco(enderecoAluno);

        //Mostrar os objetos
        System.out.println("O aluno: "+ aluno.mostra() + " e seu endereco: " + aluno.getEndereco().mostra());
        System.out.println("O professor: " + professor.mostra() + " e seu endereco: " + professor.getEndereco().mostra());
    }
}
