import javax.swing.*;
import java.util.Calendar;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmtitel, int udgivelsesår) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }
    public Film(String filmtitel) {
        this.filmtitel= filmtitel;
        this.udgivelsesår = Calendar.getInstance().get(Calendar.YEAR);
    }


    public String getFilmtitel() {
        return filmtitel;

    }

    public void setFilmtitel(String filmtitel) {
        this.filmtitel = filmtitel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;

    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;

    }

    public void knytProducerTilFilm(Producer producer) {
        this.producer = producer;

    }

    public String hentProducerInformation() {
        if (producer!= null) {
            return "Tilhørende producer: " + producer.getNavn();
        } else {
            return "Ingen tilhørende producer";

        }
    }
    public static class Producer {
        private String navn;

        public Producer(String navn) {
            this.navn = navn;

        }

        public String getNavn() {
            return navn;

        }

        public void setNavn(String navn) {
            this.navn = navn;
        }
    }

}


