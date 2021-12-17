package com;
import org.springframework.data.annotation.Id;

public class Podcast implements LukuvinkkiInterface {
    @Id
    private String tekija;
    private String otsikko;
    private String kuvaus;
    private String tyyppi;

    public Podcast(String otsikko) {
        this.otsikko = otsikko;

        this.tyyppi = "";
        this.tekija = "";
        this.kuvaus = "";
    }

    @Override
    public String getTekija() {
        return this.tekija;
    }

    @Override
    public void setTekija(String tekija) {
        this.tekija = tekija;
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
    public String getTyyppi() {
        return this.tyyppi;
    }

    @Override
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    @Override
    public String toString() {
        String kirja = "Tekijä: " + getTekija();
        kirja += "Otsikko: " + getOtsikko() + "\n";
        kirja += "Kuvaus: " + getKuvaus() + "\n";
        kirja += "Tyyppi: " + getTyyppi();

        return kirja;
    }
}
