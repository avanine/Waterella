import com.waterella.mdbspringboot.model.Kirja;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
    Kirja vinkki;
    Podcast podcast;
    
    @Given("Kirja luodaan nimellä Tuoteseloste")
    public void setUp() {
        vinkki = new Kirja("Tuoteseloste");
    }

    @Then("kirjan nimen tulee olla Tuoteseloste")
    public void konstruktoriLuoOikeanOtsikkosenLukuvinkin() {
        assertEquals("Tuoteseloste", vinkki.getOtsikko());
    }

    @When("kuvaus 'kirjan kuvaus' lisätään")
    public void setKuvausTest() {
        vinkki.setKuvaus("kirjan kuvaus");
        assertEquals("kirjan kuvaus", vinkki.getKuvaus());
    }

    @Then("kirjan kuvaus tulee olla 'kirjan kuvaus'")
    public void getKuvausTest() {
        assertEquals("kirjan kuvaus", vinkki.getKuvaus());
    }

    @Given("Kirja luodaan nimellä Tuoteseloste")
    public void setUpPodcast() {
        podcast = new Podcast("podcast");
    }

    @Then("kirjan nimen tulee olla Tuoteseloste")
    public void konstruktoriLuoOikeanOtsikkosenPodcastin() {
        assertEquals("podcast", podcast.getOtsikko());
    }   

}
