package com.waterella.mdbspringboot.repository;

import com.waterella.mdbspringboot.model.LukuvinkkiInterface;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LukuvinkkiRepository extends MongoRepository<LukuvinkkiInterface, String> {
    List<LukuvinkkiInterface> findByTyyppi(String tyyppi);
    List<LukuvinkkiInterface> findByTekija(String tekija);
}
