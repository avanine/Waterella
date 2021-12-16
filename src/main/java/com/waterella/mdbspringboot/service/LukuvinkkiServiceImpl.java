package com.waterella.mdbspringboot.service;

import com.waterella.mdbspringboot.model.LukuvinkkiInterface;
import com.waterella.mdbspringboot.repository.LukuvinkkiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LukuvinkkiServiceImpl implements LukuvinkkiService {

    @Autowired
    private LukuvinkkiRepository lukuvinkkiRepository;

    @Override
    public LukuvinkkiInterface saveVinkki(LukuvinkkiInterface lukuvinkki) {
        return lukuvinkkiRepository.save(lukuvinkki);
    }

    @Override
    public List<LukuvinkkiInterface> getAllVinkit() {
        return lukuvinkkiRepository.findAll();
    }

    @Override
    public List<LukuvinkkiInterface> getByTyyppi(String tyyppi) {
        return lukuvinkkiRepository.findByTyyppi(tyyppi);
    }

    @Override
    public List<LukuvinkkiInterface> getByTekija(String tekija) {
        return lukuvinkkiRepository.findByTekija(tekija);
    }
}
