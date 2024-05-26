package Eventi.it;

import java.time.LocalDate;
import java.time.LocalTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

	private LocalTime ora;
	private int prezzo;

//    public Concert(LocalDate data , LocalTime ora) {
//        this.ora = ora;
//        this.prezzo = prezzo;
//    }

	// get & set of time
	public LocalTime getTime() {
		return ora;
	}

	public void setTime(LocalTime time) {
		this.ora = ora;
	}

	// get & set of prezzo
	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	
	public String getDataOraFormattata() {
		 LocalTime currentTime = LocalTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        String formattedTime = currentTime.format(formatter);
//	        System.out.println("Formatted Current Time: " + formattedTime);
	        return formattedTime;
    }
	
	 @Override
	    public String toString() {
	        return "Hai prenotato alle ore : " + getDataOraFormattata() + " e il prezzo del biglietto e di : " + getPrezzo() + "€" ;
	    }


	
}
