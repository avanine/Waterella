/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.Kirja;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hejoel
 */
public class KirjaTest {

    Kirja vinkki;

    @BeforeEach
    public void setUp() {
        vinkki = new Kirja("Tuoteseloste");
    }

    @Test
    public void konstruktoriLuoOikeanOtsikkosenLukuvinkin() {
        assertEquals("Tuoteseloste", vinkki.getOtsikko());
    }

    @Test
    public void konstruktoriLuoLukuvinkilleTyhjanKuvauksen() {
        assertEquals("", vinkki.getKuvaus());
    }

    @Test
    public void setKuvausTest() {
        vinkki.setKuvaus("Heihei");
        assertEquals("Heihei", vinkki.getKuvaus());
    }

    /*@Test
    public void toStringTest() {
        vinkki.setOtsikko("Joku");
        vinkki.setKuvaus("Hello");
        assertEquals("Otsikko: Joku" + "\n" + "Kuvaus: Hello" + "\n" + "Tyyppi: Kirja" + "\n", vinkki.toString());
    }*/

    @Test
    public void addTekijaTest() {
        vinkki.setTekija("tekijä");
        assertEquals("tekijä", vinkki.getTekija());
    }

    /*@Test
    public void removeTekijaTest() {
        vinkki.addTekija("tekijä");
        vinkki.addTekija("tekijä2");
        vinkki.removeTekija("tekijä");
        
        assertEquals("tekijä2", vinkki.getTekijat().get(0));
    }*/

    /*@Test
    public void tekijaToStringTest() {
        vinkki.addTekija("tekijä");
        vinkki.addTekija("tekijä2");
        assertEquals("tekijä, tekijä2, ", vinkki.tekijatToString());
    }*/

    @Test
    public void getOtsikkoTest() {
        vinkki.setOtsikko("Joku");
        
        assertEquals("Joku", vinkki.getOtsikko());
    }

    @Test
    public void getKuvausTest() {
        vinkki.setKuvaus("Joku");
        
        assertEquals("Joku", vinkki.getKuvaus());
    }

    /*@Test
    public void getKommenttiTest() {
        vinkki.setKommentti("Joku");
        
        assertEquals("Joku", vinkki.getKommentti());
    }*/

    /*@Test
    public void addKurssiTest() {
        vinkki.addLiittyvaKurssi("kurssi");
        assertEquals("kurssi", vinkki.getLiittyvatKurssit().get(0));
    }*/

    /*@Test
    public void removeKurssiTest() {
        vinkki.addLiittyvaKurssi("kurssi");
        vinkki.addLiittyvaKurssi("kurssi2");
        vinkki.removeLiittyvaKurssi("kurssi");
        assertEquals("kurssi2", vinkki.getLiittyvatKurssit().get(0));
    }*/

    /*@Test
    public void kurssitToStringTest() {
        vinkki.addLiittyvaKurssi("kurssi");
        assertEquals("kurssi, ", vinkki.liittyvatKurssitToString());
    }*/

    /*@Test
    public void addTagiTest() {
        vinkki.addTagi("tagi");
        assertEquals("tagi", vinkki.getTagit().get(0));
    }*/

    /*@Test
    public void removeTagiTest() {
        vinkki.addTagi("tagi");
        vinkki.addTagi("tagi2");
        vinkki.removeTagi("tagi");
        assertEquals("tagi2", vinkki.getTagit().get(0));
    }*/

    /*@Test
    public void tagitToStringTest() {
        vinkki.addTagi("tagi");
        assertEquals("tagi, ", vinkki.tagitToString());
    }*/

    /*@Test
    public void getIsbnTest() {
        vinkki.setIsbn("1");
        assertEquals("1", vinkki.getIsbn());
    }*/

}
