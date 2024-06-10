package Eventi.it;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// Create a Concerto object with the total number of seats
		System.out.println("Inserisci il numero totale di posti:");
		int numeroPostiTotali = input.nextInt();
		input.nextLine(); // consume the newline
		Concerto concerto = new Concerto(numeroPostiTotali);

		// Set the title
		System.out.println("Inserisci il titolo del concerto:");
		concerto.setTitolo(input.nextLine());

		// Set the date
		System.out.println("Inserisci la data del concerto (dd/MM/yyyy):");
		String data = input.nextLine();
		LocalDate dataConvertita = LocalDate.parse(data, dateFormatter);
		concerto.setData(dataConvertita.atStartOfDay());

		if (!concerto.isValidDate(dataConvertita.atStartOfDay())) {
			System.out.println("Data non valida.");
			return;
		}

		// Set the ticket price
		System.out.println("Inserisci il prezzo del biglietto:");
		concerto.setPrezzo(input.nextInt());

		// Perform booking operations
		System.out.println("Inserisci posti da prenotare:");
		concerto.prenota(input.nextInt());
		System.out.println("Posti prenotati: " + concerto.getPostiPrenotati());
		System.out.println("Posti totali disponibili: " + concerto.getPostiTotale());

		System.out.println("Inserisci posti da prenotare:");
		concerto.prenota(input.nextInt());
		System.out.println("Posti prenotati: " + concerto.getPostiPrenotati());
		System.out.println("Posti totali disponibili: " + concerto.getPostiTotale());

		System.out.println("Inserisci posti da disdire:");
		concerto.disdici(input.nextInt());
		System.out.println("Posti prenotati: " + concerto.getPostiPrenotati());
		System.out.println("Posti totali disponibili: " + concerto.getPostiTotale());

		// Print event and concert details
		System.out.println();
		System.out.println(concerto);
	}
}
