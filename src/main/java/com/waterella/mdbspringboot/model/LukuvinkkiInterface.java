package com.waterella.mdbspringboot.model;

import org.springframework.stereotype.Component;

public interface LukuvinkkiInterface {

    String getTekija();
    void setTekija(String tekija);
    String getOtsikko();
    void setOtsikko(String otsikko);
    String getKuvaus();
    void setKuvaus(String kuvaus);
    String getTyyppi();
    void setTyyppi(String tyyppi);
}
