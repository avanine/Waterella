package com.waterella.mdbspringboot.service;

import com.waterella.mdbspringboot.model.LukuvinkkiInterface;

import java.util.List;

public interface LukuvinkkiService {
    public LukuvinkkiInterface saveVinkki(LukuvinkkiInterface vinkki);
    public List<LukuvinkkiInterface> getAllVinkit();
    public List<LukuvinkkiInterface> getByTyyppi(String tyyppi);
    public List<LukuvinkkiInterface> getByTekija(String tekija);
}
