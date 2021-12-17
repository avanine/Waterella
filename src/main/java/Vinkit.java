import java.util.ArrayList;
import java.util.List;

public class Vinkit {
    //List<LukuvinkkiInterface> vinkit;

    public Vinkit() {
        vinkit = new ArrayList<>();
    }

    /*public void lisaa(LukuvinkkiInterface vinkki) {
        vinkit.add(vinkki);
    }*/

    public String listaaVinkit() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < vinkit.size(); i++) {
            sb.append(vinkit.get(i));
            sb.append("\n");
        }

        return sb.toString();
    }
}
