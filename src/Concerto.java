import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
  private LocalTime ora;
  private double prezzo;

  public Concerto() {
  }

  // costruttore di concerto con i super del classe padre
  public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, int prezzo) {
    super(titolo, data, postiTotali);
    this.ora = ora;
    this.prezzo = prezzo;
  }

  // getter e setter
  public LocalTime getOra() {
    return ora;
  }

  public void setOra(LocalTime ora) {
    this.ora = ora;
  }

  public double getPrezzo() {
    return prezzo;
  }

  public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
  }

  public void OraDelEvento(String ora) {
    DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
    this.ora = LocalTime.parse(ora, formatTime);
  }

  @Override
  public String toString() {
    DecimalFormat df = new DecimalFormat("0.00");

    return "Concerto ore = " + ora + ", prezzo = " + df.format(prezzo) + "€"
        + ", Titolo = " + getTitolo() + ", Data = " + getData() + ", PostiTotali = " + getPostiTotali();
  }

}
