public class HelloWorld {
    String name;
    String mensagem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String imprimir(){
        mensagem = "Olá "+this.getName()+". Você acabou de fazer seu primeiro HelloWorld em Java. Parabéns.";
        return mensagem;
    }
}