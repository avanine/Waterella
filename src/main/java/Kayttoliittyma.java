import java.util.ArrayList;
import java.util.Scanner;

public class Kayttoliittyma {
    
    public static void start() {
    
        Scanner sc = new Scanner(System.in);
        String nimi;
        String kuvaus;
        Lukuvinkki vinkki;
        Vinkit vinkit = new Vinkit();
        
        while (true) {
            System.out.println("Anna lukuvinkin nimi (tyhjä lopettaa):");
            nimi = sc.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.println("Lukuvinkin kuvaus: ");
            kuvaus = sc.nextLine();
            vinkki = new Lukuvinkki(nimi);
            vinkki.setKuvaus(kuvaus);
            vinkit.lisaa(vinkki);

            vinkit.listaaVinkit();
        }
    
    }
 
}
