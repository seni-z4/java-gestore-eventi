package Eventi.it;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Evento event1 = new Evento(100);
		Concerto consert = new Concerto();

		Scanner input = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		event1.setData(LocalDateTime.of(2024, 5, 24, 10, 30));
//		consert.setTime(LocalTime.of(10, 00));

		// titolo
		System.out.println("Inserici il titolo del Evento");
		event1.setTitolo(input.nextLine());

		// data
		System.out.println("Inserici la data del evento");
		String data = input.nextLine();
		LocalDate dataConvertito = LocalDate.parse(data, dateFormatter);

		// prezzo del bilgetto
		System.out.println("Inserisci il prezzo del biglietto:");
		consert.setPrezzo(input.nextInt());

		// current time

//		 LocalTime currentTime = LocalTime.now();
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//	        String formattedTime = currentTime.format(formatter);
//	        System.out.println("Formatted Current Time: " + formattedTime);
	    

		event1.setData(dataConvertito.atStartOfDay());

		if (!event1.isValidDate(dataConvertito.atStartOfDay())) {
			return;
		}
//		System.out.println(event1.getData());

		System.out.println("inserici posti da prenotare : ");
		event1.prenota(input.nextInt());
		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());
		System.out.println("inserici posti da prenotare : ");
		event1.prenota(input.nextInt());
		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());

		System.out.println("inserici posti da prenotare : ");
		event1.prenota(input.nextInt());
		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());

		System.out.println("inserici posti da prenotare : ");
		event1.prenota(input.nextInt());
		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());

		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());

		System.out.println("inserici posti da dirdire : ");
		event1.disdici(input.nextInt());
		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());

		System.out.println("inserici posti da prenotare : ");
		event1.prenota(input.nextInt());
		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());

		System.out.println("inserici posti da dirdire : ");
		event1.disdici(input.nextInt());
		System.out.println("posti prenotati : " + event1.getPostiPrenotati());
		System.out.println("posti totali : " + event1.getPostiTotale());

		System.out.println();
		System.out.println(event1);
		System.out.println(consert.toString());


//		// TODO Auto-generated method stub
//		Evento event = new Evento();
//
//		System.out.println("#####################################################");
//		Scanner input = new Scanner(System.in);
////
////		// posti disponibili
////		System.out.println("inserici il numero di posto per vedere ci sono posti disponibili");
////		event.setPostiTotali(input.nextInt());
////
////		// posti prenotati
////		System.out.println("inserici i posti prenotati");
////		event.prenota(input.nextInt());
//
//////		//posti disdire
//////		System.out.println("inserici quanti posti vuoi disdire");
//////		event.disdici(input.nextInt());
//
//		System.out.println("insert the total number of spots");
//		System.out.println(event.prenota(input.nextInt()));
//		event.setNumeroPostiTotali(input.nextInt());
//		
//		// Print initial bookings
//		System.out.println("Posti prenotati: " + event.getNumeroPostiPrenotati());
//
//		// Make a booking
//		event.prenota();
//		System.out.println("Posti prenotati dopo la prenotazione: " + event.getNumeroPostiPrenotati());

	}

}