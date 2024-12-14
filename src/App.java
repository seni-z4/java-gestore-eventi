import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Evento evento = new Evento();

        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // ask the date
        System.out.println("inserici la data (yyyy-MM-dd): ");
        String dataInput = input.nextLine();

        // converto da int in localdate
        LocalDate date = LocalDate.parse(dataInput, formatter);

        //
        System.out.println("inserici i posti totali");
        int PostiTotali = input.nextInt();

        evento.checkDate(date, PostiTotali);

    }
}
