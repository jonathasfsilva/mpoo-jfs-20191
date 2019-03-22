import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        HelloWorld hello = new HelloWorld();
        HelloWorld hello2 = new HelloWorld();
        hello.setName("Jonathas");
        hello2.setName("Jonathas F Silva");
        Date hora = Calendar.getInstance().getTime();
        String dataFormatada = sdf.format(hora);
        System.out.println(dataFormatada + " - " +hello.imprimir());
        System.out.println(dataFormatada + " - " +hello2.imprimir());
    }

}