package com.waterella.mdbspringboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.waterella.mdbspringboot.repository.ItemRepository;
import com.waterella.mdbspringboot.model.TipItem;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication implements CommandLineRunner {

    @Autowired
    ItemRepository tipItemRepo;

    List<TipItem> itemList = new ArrayList<TipItem>();
    
    public static void main(String[] args) {
        SpringApplication.run(MdbSpringBootApplication.class, args);
    }

    public void run(String... args) {

          alustaLukuvinkit();
          luoLukuvinkki("testi", "asdfas", "asdfasdfas");
          naytaKaikkiLukuvinkit();

    }

    void alustaLukuvinkit() {

        tipItemRepo.save(new TipItem("eka", "tyyppi", "kuvaus"));
        tipItemRepo.save(new TipItem("toka", "tyyppi", "kuvaus"));
    
    }

    public void naytaKaikkiLukuvinkit() {

        itemList = tipItemRepo.findAll();
        itemList.forEach(item -> System.out.println(getItemDetails(item)));
        
    }

    public void luoLukuvinkki(String category, String name, String description) {

        tipItemRepo.save(new TipItem(name,category,description));

    }
	 
    public String getItemDetails(TipItem item) {

        System.out.println(
                "Otsikko: " + item.getName()
                + ", \nTyyppi: " + item.getItemCategory()
                + ", \nKuvaus: " + item.getItemDescription()
        );

        return "";
    }
}
