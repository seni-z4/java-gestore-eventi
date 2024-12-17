import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Evento evento = new Evento();
        Concerto concerto = new Concerto();
        Scanner input = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // ask the title of the event
        System.out.println("inserici il nome del evento");
        String nomeEvent = input.nextLine();
        concerto.setTitolo(nomeEvent);

        // ask the date
        System.out.println("inserici la data (yyyy-MM-dd): ");
        String dataInput = input.nextLine();

        // converto da int in localdate
        LocalDate date = LocalDate.parse(dataInput, formatter);
        concerto.setData(date);

        // oraio del evento
        System.out.println("inserici la ora (HH:mm): ");
        String orario = input.nextLine();
        concerto.OraDelEvento(orario);

        // prezzo del evento
        System.out.println("inserici il prezzo del evento: ");
        double price = input.nextDouble();
        // DecimalFormat prezzoFormattato = new DecimalFormat("0.00");
        // System.out.println(prezzoFormattato.format(price));

        concerto.setPrezzo(price);

        //
        System.out.println("inserici i posti totali");
        int PostiTotali = input.nextInt();
        concerto.setPostiTotali(PostiTotali);

        // variable postiprenotati
        int PostiPrenotati = 0;

        evento.checkDate(date, PostiTotali);

        // evento.prenota(PostiTotali, date);

        while (true) {
            // selezionare dal utente che cosa fare prenotare no disdire

            System.out.println("scelgi il numero in base alla operazione ci vuoi effetuare");
            System.out.println("1. Prenotare");
            System.out.println("2. Disdire");
            System.out.println("3. to string");
            System.out.println("4. exit");

            int user = input.nextInt();

            switch (user) {

                case 1:

                    if (PostiPrenotati >= PostiTotali) {
                        System.out.println("tutti i posti sono prenotati");
                        break;
                    }
                    System.out.println("quanti posti vuoi prenotare");
                    int postiDaPrenotare = input.nextInt();

                    if (postiDaPrenotare <= 0) {
                        System.out.println("Il numero di posti deve essere positivo.");
                    } else if (PostiPrenotati + postiDaPrenotare > PostiTotali) {
                        System.out.println("Non ci sono abbastanza posti disponibili.");
                    } else {
                        PostiPrenotati += postiDaPrenotare;
                        System.out.println("Prenotazione effettuata. Posti prenotati: " + PostiPrenotati +
                                "/" + PostiTotali);
                    }

                    break;

                case 2:

                    if (PostiPrenotati <= 0) {
                        System.out.println("non ci sono posto da disdire");
                        break;
                    }
                    System.out.println("quanti posti vuoi disdire");
                    int postiDaDisdire = input.nextInt();

                    if (postiDaDisdire <= 0) {
                        System.out.println("Il numero di posti deve essere positivo.");
                    } else if (postiDaDisdire > PostiTotali) {
                        System.out.println("Non ci sono abbastanza posti da disdire.");
                    } else {
                        PostiPrenotati -= postiDaDisdire;
                        if (PostiPrenotati <= 0) {
                            System.out.println("Non ci sono abbastanza posti da disdire");
                            PostiPrenotati += postiDaDisdire;
                            break;
                        } else {
                            System.out.println("Cancellazione effettuata. Posti disdetti: " +
                                    PostiPrenotati +
                                    "/" + PostiTotali);

                        }

                    }

                    break;
                case 3:
                    System.out.println(concerto.toString());
                    break;
                case 4:
                    System.out.println("exitting the program");
                    return;
                default:
                    System.out.println("inserici un numero tra (1-3)");
                    break;
            }

        }

    }

}
