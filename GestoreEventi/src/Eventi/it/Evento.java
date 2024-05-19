package Eventi.it;

public class Evento {
	// attributi del evento
	private String titolo;
	private String data;
	private int numeroPostiTotale;
	private int numeroPostiPrenotati;

	// costruttore che inizializza gli attributi
	public Evento(String titolo, String data, int numeroPostiTotali) {
		this.titolo = titolo;
		this.data = data;
		this.numeroPostiTotale = numeroPostiTotali;
		this.numeroPostiPrenotati = 0; // Inizializzato a 0

	}

	// get&set di titolo
	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titoloEvento) {
		this.titolo = titoloEvento;
	}

	// get&set data
	public String getData() {
		return this.data;
	}

	public void setData(String dataEvento) {
		if (dataEvento == dataEvento) {
			System.out.println("data del evento valido");
		} else {
			System.out.println("data del evento non valido");
		}

		this.data = dataEvento;
	}

	// get&set posti totale
	public int getPostiTotali() {
		return this.numeroPostiTotale;
	}

	public void setPostiTotali(int postiTotaliEvento) {
		if (postiTotaliEvento > 0) {
			System.out.println("e disponibile");
		} else {
			System.out.println("non disponibile");
		}
	}

	// get posti prenotati
	public int getPostiPrenotati() {
		return this.numeroPostiPrenotati;
	}

	// metodo prenota & disdici

	public void prenota(String prenotaEvento) {
		if (numeroPostiPrenotati <= 100) {
			numeroPostiPrenotati++;
			System.out.println("1 posto aggiunto");
		} else {
			numeroPostiPrenotati--;
			System.out.println("non ha posti disponibili");

		}
	}

	@Override
	public String toString() {
		return "titolo del evento: " + titolo + "\n"+ "data del evento: " + data +"\n" + "inserici totale numeri posti: "
				+ numeroPostiTotale + "\n" + "inserici totale posti prenotati" + numeroPostiPrenotati;
	}

}
