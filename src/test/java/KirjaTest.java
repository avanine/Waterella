/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

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

    @Test
    public void toStringTest() {
        vinkki.setOtsikko("Joku");
        vinkki.setKuvaus("Hello");
        assertEquals("Otsikko: Joku" + "\n" + "Kuvaus: Hello" + "\n" + "Tyyppi: Kirja" + "\n", vinkki.toString());
    }

}
