package Eventi.it;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Evento event1 = new Evento(100);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		event1.setData(LocalDateTime.of(2024, 5, 24, 00, 00));

		// titolo
		System.out.println("inserici il titolo del evento");
		event1.setTitolo(input.nextLine());

		// data
		System.out.println("inserie la data");
		String data = input.nextLine();
		LocalDate dataConvertito = LocalDate.parse(data, dateFormatter);
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

		System.out.println(event1);

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