import java.time.LocalDate;

public class Evento {

  // variable di istanza del evento
  private String titolo;
  private LocalDate data;
  private int PostiTotali;
  private int PostiPrenotati;

  public Evento() {
  }

  // costruttore
  public Evento(String titolo, LocalDate data, int postiTotali) {
    this.titolo = titolo;
    this.data = data;
    this.PostiTotali = postiTotali;
    this.PostiPrenotati = 0;
  }

  // check che la data nn e passata e il posto totale e positivo
  public void checkDate(LocalDate data, int postiTotali) {
    if (data.isAfter(LocalDate.now()) && postiTotali > 0) {
      System.out.println("data checked + " + data + " poosti check " + postiTotali);
    } else {
      System.out.println("la data inserito e gia passato o posti totali sono negativi");
    }
  }

  // gettera and getter

  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public int getPostiTotali() {
    return PostiTotali;
  }

  public int getPostiPrenotati() {
    return PostiPrenotati;
  }

  @Override
  public String toString() {
    return "Evento [titolo=" + titolo + ", data=" + data + "]";
  }

  // // methodo per prenotare
  // public void prenota(int PostiPrenotati, int postiTotali, LocalDate data) {
  // if (data.isAfter(LocalDate.now())) {
  // if (PostiPrenotati > postiTotali) {
  // System.out.println("non ci sono posti da prenotatre");
  // } else {
  // int totposti = 0;
  // totposti += PostiPrenotati;
  // // tot - posti totali per far vedere qunati posti sono rimarsti
  // System.out.println(postiTotali - totposti + " posti rimasti da prenotare");
  // }
  // }
  // }

  // methodo per prenotare
  // public void prenota(int postiTotali, LocalDate data) {
  // if (data.isAfter(LocalDate.now())) {
  // if (PostiPrenotati > postiTotali) {
  // System.out.println("non ci sono posti da prenotatre");
  // }
  // if (postiTotali <= 0) {
  // System.out.println("numero di posti deve essere maggiore di zeo");
  // }
  // }
  // }

}
