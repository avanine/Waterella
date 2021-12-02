/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hejoel
 */
public class LukuvinkkiTest {

    Lukuvinkki vinkki;

    @BeforeEach
    public void setUp() {
        vinkki = new Lukuvinkki("Tuoteseloste");
    }

    @Test
    public void konstruktoriLuoOikeanNimisenLukuvinkin() {
        assertEquals("Otsikko: Tuoteseloste", vinkki.getNimi());
    }

    @Test
    public void konstruktoriLuoLukuvinkilleTyhjanKuvauksen() {
        assertEquals("Kuvaus: ", vinkki.getKuvaus());
    }

    @Test
    public void setKuvausTest() {
        vinkki.setKuvaus("Heihei");
        assertEquals("Kuvaus: Heihei", vinkki.getKuvaus());
    }

    @Test
    public void toStringTest() {
        vinkki.setNimi("Joku");
        vinkki.setKuvaus("Hello");
        assertEquals("Otsikko: Joku" + "\n" + "Kuvaus: Hello", vinkki.toString());
    }

}
