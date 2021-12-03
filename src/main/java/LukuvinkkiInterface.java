import java.util.List;

public interface LukuvinkkiInterface {

    List<String> getTekijat();
    void addTekija(String tekija);
    void removeTekija(String tekija);
    String tekijatToString();
    String getNimi();
    void setNimi(String nimi);
    String getKuvaus();
    void setKuvaus(String kuvaus);
    String getKommentti();
    void setKommentti(String kommentti);
    void addLiittyvaKurssi(String kurssi);
    void removeLiittyvaKurssi(String kurssi);
    List<String> getLiittyvatKurssit();
    String liittyvatKurssitToString();
    void addTagi(String tagi);
    void removeTagi(String tagi);
    List<String> getTagit();
    String tagitToString();
}
