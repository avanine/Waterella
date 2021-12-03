import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Podcast implements LukuvinkkiInterface {
    private List<String> tekijat;
    private String nimi;
    private URL url;
    private String kuvaus;
    private List<String> relatedCourses;

    public Podcast(String nimi) {
        this.nimi = nimi;
        this.kuvaus = "";
        this.relatedCourses = new ArrayList<>();
    }

    @Override
    public List<String> getTekijat() {
        return this.tekijat;
    }

    @Override
    public void addTekija(String tekija) {
        this.tekijat.add(tekija);
    }

    @Override
    public void removeTekija(String tekija) {
        if (this.tekijat.contains(tekija)) {
            int i = this.tekijat.indexOf(tekija);
            this.tekijat.remove(i);
        }
    }

    @Override
    public String tekijatToString() {
        String tekijatStr = "";
        for (String henkilo : this.tekijat) {
            tekijatStr += henkilo + ", ";
        }
        return tekijatStr;
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }

    @Override
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String getKuvaus() {
        return this.kuvaus;
    }

    @Override
    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    @Override
    public String getKommentti() {
        return null;
    }

    @Override
    public void setKommentti(String kommentti) {

    }

    @Override
    public void addLiittyvaKurssi(String kurssi) {

    }

    @Override
    public void removeLiittyvaKurssi(String kurssi) {

    }

    @Override
    public List<String> getLiittyvatKurssit() {
        return null;
    }

    @Override
    public String liittyvatKurssitToString() {
        return null;
    }

    @Override
    public void addTagi(String tagi) {

    }

    @Override
    public void removeTagi(String tagi) {

    }

    @Override
    public List<String> getTagit() {
        return null;
    }

    @Override
    public String tagitToString() {
        return null;
    }

    @Override
    public String toString() {
        return "Otsikko: " + this.nimi + "\n" +
                "Kuvaus: " + this.kuvaus + "\n" +
                "Tyyppi: Podcast";
    }
}
