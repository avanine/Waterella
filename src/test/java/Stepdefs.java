import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
    Kirja vinkki;
    
    @Given("Kirja luodaan nimellä Tuoteseloste")
    public void setUp() {
        vinkki = new Kirja("Tuoteseloste");
    }

    @Then("kirjan nimen tulee olla Tuoteseloste")
    public void konstruktoriLuoOikeanOtsikkosenLukuvinkin() {
        assertEquals("Tuoteseloste", vinkki.getOtsikko());
    }   

}
