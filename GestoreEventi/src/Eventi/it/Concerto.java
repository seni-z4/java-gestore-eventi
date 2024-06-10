package Eventi.it;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {

    private LocalTime ora;
    private int prezzo;

    // Constructor calling Evento constructor
    public Concerto(int numeroPostiTotali) {
        super(numeroPostiTotali);
    }

    // get & set of time
    public LocalTime getTime() {
        return ora;
    }

    public void setTime(LocalTime time) {
        this.ora = time;
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
        return currentTime.format(formatter);
    }

    @Override
    public String toString() {
        return "Hai prenotato alle ore: " + getDataOraFormattata() + " e il prezzo del biglietto è di: " + getPrezzo() + "€";
    }
}