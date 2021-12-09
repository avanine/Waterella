import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Podcast implements LukuvinkkiInterface {
    private List<String> tekijat;
    private String otsikko;
    private URL url;
    private String kuvaus;
    private List<String> relatedCourses;
    private String kommentti;
    private List<String> tagit;

    public Podcast(String otsikko) {
        this.otsikko = otsikko;
        this.kuvaus = "";
        this.relatedCourses = new ArrayList<>();
        this.tekijat = new ArrayList<>();
        this.tagit = new ArrayList<>();
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
    public String getOtsikko() {
        return this.otsikko;
    }

    @Override
    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
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
        return this.kommentti;
    }

    @Override
    public void setKommentti(String kommentti) {
        this.kommentti = kommentti;
    }

    @Override
    public void addLiittyvaKurssi(String kurssi) {
        this.relatedCourses.add(kurssi);
    }

    @Override
    public void removeLiittyvaKurssi(String kurssi) {
        this.removeFromListByString(relatedCourses, kurssi);
    }

    @Override
    public List<String> getLiittyvatKurssit() {
        return relatedCourses;
    }

    @Override
    public String liittyvatKurssitToString() {
        return listToString(relatedCourses);
    }

    @Override
    public void addTagi(String tagi) {
        this.tagit.add(tagi);
    }

    @Override
    public void removeTagi(String tagi) {
        this.removeFromListByString(tagit, tagi);
    }

    @Override
    public List<String> getTagit() {
        return this.tagit;
    }

    @Override
    public String tagitToString() {
        return listToString(tagit);
    }

    @Override
    public String toString() {
        return "Otsikko: " + this.otsikko + "\n" +
                "Kuvaus: " + this.kuvaus + "\n" +
                "Tyyppi: Podcast";
    }

    private void removeFromListByString(List<String> list, String s) {
        if (list.contains(s)) {
            int i = list.indexOf(s);
            list.remove(i);
        }
    }

    private String listToString(List<String> list) {
        String stringFromList = "";
        for (String henkilo : list) {
            stringFromList += henkilo + ", ";
        }
        return stringFromList;
    }
}
