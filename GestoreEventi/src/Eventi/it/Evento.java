package Eventi.it;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {

	// attributi
	private String titolo;
	private LocalDateTime data;
	private int numeroPostiTotale;
	private int numeroPostiPrenotati;
	private DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
	private int numeroPostiDefiniti;

	public Evento() {

	}

	// costruttore overload
	public Evento(int numeroPostiTotali) {
		this.titolo = "";
//		LocalDate dateToConvert = LocalDate.parse(data,dateFormatter);
		this.data = LocalDateTime.now();
		this.numeroPostiTotale = numeroPostiTotali;
		this.numeroPostiPrenotati = 0; // Inizializzato a 0
		this.numeroPostiDefiniti = numeroPostiTotali;
	}

	// get&set di titolo
	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titoloEvento) {
		this.titolo = titoloEvento;
	}

	// get&set data
	public LocalDateTime getData() {
		return this.data;
	}

	public void setData(LocalDateTime dataEvento) {
		if (this.data.isAfter(dataEvento)) {
			System.out.println("data no disponibile");
			return;
		}
		this.data = dataEvento;
	}

	// gettotali
	public int getPostiTotale() {
		return this.numeroPostiTotale;
	}

	// getposti
	public int getPostiPrenotati() {
		return this.numeroPostiPrenotati;
	}

	// prenota
	public void prenota(int postiDaPrentare) {

		if (numeroPostiTotale == 0) {
			System.out.println("posti non disponibile");
			return;
		}

		this.numeroPostiPrenotati += postiDaPrentare;
		this.numeroPostiTotale -= postiDaPrentare;

	}

	// disdici

	public void disdici(int postiDaDisdire) {

		if (numeroPostiTotale >= numeroPostiDefiniti) {
			System.out.println("evento non valido");
			return;
		}

		this.numeroPostiPrenotati -= postiDaDisdire;
		this.numeroPostiTotale += postiDaDisdire;

	}
	
	public boolean isValidDate(LocalDateTime dataEvento) {
		if (this.data.isAfter(dataEvento)) {
			return false;
		}
		return true;
	}

	// override to string
	@Override
	public String toString() {
		dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "titolo del evento: " + this.titolo + "\n" + "data del evento: " + this.data.format(dateFormatter) + "\n"
				+ "posti totali disponibili: " + this.numeroPostiTotale;
	}

}
