import java.util.ArrayList;
import java.util.List;

public class Vinkit {
    List<Lukuvinkki> vinkit;

    public Vinkit() {
        vinkit = new ArrayList<>();
    }

    public void lisaa(Lukuvinkki vinkki) {
        vinkit.add(vinkki);
    }

    public void listaaVinkit() {
        for (int i = 0; i < vinkit.size(); i++) {
            System.out.println(vinkit.get(i));
            System.out.println("");
        }
    }
}
