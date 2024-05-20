package Eventi.it;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Evento event = new Evento("martin garix", "2024/06/15", 1);

		System.out.println(event.toString());
		System.out.println("#####################################################");
		Scanner input = new Scanner(System.in);
		System.out.println("insert the number of people attending");
		System.out.println(event.prenota(input.nextInt()));
		System.out.println(event.getPostiPrenotati());
		System.out.println(event.disdici(event.getPostiPrenotati()));
		
		
		//
		System.out.println("posti prenotati; " + event.getPostiPrenotati()); 
	}
}
