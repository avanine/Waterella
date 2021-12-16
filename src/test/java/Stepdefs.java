import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
    Kirja vinkki;
    Podcast podcast;
    Vinkit lista;
    
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

    @Given("Podcast luodaan nimellä podcast")
    public void setUpPodcast() {
        podcast = new Podcast("podcast");
        lista = new Vinkit();
    }

    @Then("podcastin kuvaus tulee olla 'podcastin kuvaus'")
    public void konstruktoriLuoOikeanOtsikkosenPodcastin() {
        assertEquals("podcast", podcast.getOtsikko());
    }
    
    @When("Toinen Podcast lisätään nimellä podcast2")
    public void listaaVinkitTest() {
        Podcast podcast2 = new Podcast("podcast2")
        lista.lisaa(podcast);
        lista.lisaa(podcast2);
        String tulostus = vinkki.listaaVinkit();
        assertTrue(tulostus.contains("podcast2"));
        
    }

}
