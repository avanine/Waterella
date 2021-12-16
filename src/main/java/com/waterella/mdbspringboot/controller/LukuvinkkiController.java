package com.waterella.mdbspringboot.controller;

import com.waterella.mdbspringboot.model.LukuvinkkiInterface;
import com.waterella.mdbspringboot.service.LukuvinkkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lukuvinkki")
@CrossOrigin
public class LukuvinkkiController {
    @Autowired
    private LukuvinkkiService lukuvinkkiService;

    @PostMapping("/add")
    public String add(@RequestBody LukuvinkkiInterface LukuvinkkiInterface){
        lukuvinkkiService.saveVinkki(LukuvinkkiInterface);
        return "New lukuvinkki is added";
    }

    @GetMapping("/getAll")
    public List<LukuvinkkiInterface> list() {
        return lukuvinkkiService.getAllVinkit();
    }

    @GetMapping("/getByTyyppi/{tyyppi}")
    public List<LukuvinkkiInterface> listByTyyppi(@PathVariable("tyyppi") String tyyppi) {
        return lukuvinkkiService.getByTyyppi(tyyppi);
    }

    @GetMapping("/getByTekija/{tekija}")
    public List<LukuvinkkiInterface> listByTekija(@PathVariable("tekija") String tekija) {
        return lukuvinkkiService.getByTekija(tekija);
    }

}
