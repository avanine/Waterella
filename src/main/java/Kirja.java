import java.util.ArrayList;
import java.util.List;

public class Kirja implements LukuvinkkiInterface {
    private List<String> tekijat; // voi olla useampi tekijä
    private String otsikko;
    private String kuvaus;
    private String kommentti; // todennäköisesti lista lukuvinkkiin jätetyistä kommenteista
    private List<String> tagit;
    private List<String> liittyvatKurssit;
    private String isbn;

    public Kirja(String otsikko) {
        this.tekijat = new ArrayList<>();
        this.otsikko = otsikko;
        this.kuvaus = "";
        this.kommentti = "";
        this.tagit = new ArrayList<>();
        this.liittyvatKurssit = new ArrayList<>();
        this.isbn = "";
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
        removeFromListByString(this.tekijat, tekija);
    }

    @Override
    public String tekijatToString() {
        return listToString(this.tekijat);
    }

    public String getOtsikko() {
        return this.otsikko;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    public String getKuvaus() {
        return this.kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }

    @Override
    public String getKommentti() {
        return this.kommentti;
    }

    @Override
    public void setKommentti(String kommentti) {

    }

    @Override
    public void addLiittyvaKurssi(String kurssi) {

    }

    @Override
    public void removeLiittyvaKurssi(String kurssi) {
        removeFromListByString(this.liittyvatKurssit, kurssi);
    }

    @Override
    public List<String> getLiittyvatKurssit() {
        return this.liittyvatKurssit;
    }

    @Override
    public String liittyvatKurssitToString() {
        return listToString(this.liittyvatKurssit);
    }

    @Override
    public void addTagi(String tagi) {
        this.tagit.add(tagi);
    }

    @Override
    public void removeTagi(String tagi) {
        removeFromListByString(this.tagit, tagi);
    }

    @Override
    public List<String> getTagit() {
        return this.tagit;
    }

    @Override
    public String tagitToString() {
        return listToString(this.tagit);
    }

    @Override
    public String toString() {
        String kirja = "";

        if (this.tekijat.size() > 1) {
            kirja += "Kirjoittajat: " + tekijatToString() + "\n";
        } else if (this.tekijat.size() > 0) {
            kirja += "Kirjoittaja" + tekijatToString() + "\n";
        }
        kirja += "Otsikko: " + getOtsikko() + "\n";
        kirja += "Kuvaus: " + getKuvaus() + "\n";
        kirja += "Tyyppi: Kirja\n";

        if (this.isbn.length() > 0) {
            kirja += "ISBN: " + getIsbn() + "\n";
        }
        if (!tagit.isEmpty()) {
            kirja += "Tagit: " + getTagit() + "\n";
        }
        if (!liittyvatKurssit.isEmpty()) {
            kirja += "Aiheeseen liittyvät kurssit: " + liittyvatKurssitToString() + "\n";
        }
        if (this.kommentti.length() > 0) {
            kirja += "Kommentti: " + getKommentti() + "\n";
        }
        return kirja;
    }

    /**
     *
     */

    private String getIsbn() {
        return this.isbn;
    }

    private String listToString(List<String> list) {
        String stringFromList = "";
        for (String henkilo : list) {
            stringFromList += henkilo + ", ";
        }
        return stringFromList;
    }

    private void removeFromListByString(List<String> list, String s) {
        if (list.contains(s)) {
            int i = list.indexOf(s);
            list.remove(i);
        }
    }
}
