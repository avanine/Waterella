import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VinkitTest {

    Vinkit vinkki;
    Kirja kirja;

    @BeforeEach
    public void setUp() {
        vinkki = new Vinkit();
        kirja = new Kirja("Kirja");
    }

    @Test
    public void konstruktoriLuoVinkkilistan() {
        assertTrue(vinkki instanceof Vinkit);
        
    }

    @Test
    public void lisaaTest() {
        vinkki.lisaa(kirja);
        assertEquals("Kirja", vinkki.vinkit.get(0).getOtsikko());
    }

    /*@Test
    public void listaaVinkitTest() {
        vinkki.lisaa(kirja);
        
        assertEquals("Kirja", vinkki.vinkit.get(0).getOtsikko());
    }*/
}