
public class Lukuvinkki {
    private String nimi;
    private String kuvaus;

    public Lukuvinkki(String nimi) {
        this.nimi = nimi;
        this.kuvaus = "";
    }

    public String getNimi() {
        return "Otsikko: " + this.nimi;
    }

    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }

    public String getKuvaus() {
        return "Kuvaus: " + this.kuvaus;
    }

    public void setKuvaus(String uusiKuvaus) {
        this.kuvaus = uusiKuvaus;
    }

    @Override
    public String toString() {
        return "Otsikko: " + this.nimi + "\n" +
                "Kuvaus: " + this.kuvaus;
    }
}
