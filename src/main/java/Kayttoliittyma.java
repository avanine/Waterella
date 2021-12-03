import java.util.Scanner;

public class Kayttoliittyma {
    
    public static void start() {
    
        Scanner sc = new Scanner(System.in);
        String nimi;
        String kuvaus;
        String tyyppi;
        LukuvinkkiInterface vinkki;
        Vinkit vinkit = new Vinkit();
        
        while (true) {
            System.out.println("Anna lukuvinkin nimi (tyhjä lopettaa):");
            nimi = sc.nextLine();
            if (nimi.equals("")) {
                break;
            }

            System.out.println("Lukuvinkin tyyppi (K = Kirja, P = Podcast, muu lopettaa): ");
            tyyppi = sc.nextLine();
            if (!tyyppi.equals("K") && !tyyppi.equals("P")) {
                break;
            }

            System.out.println("Lukuvinkin kuvaus: ");
            kuvaus = sc.nextLine();
            if(tyyppi.equals("K")) {
                vinkki = new Kirja(nimi);
            } else {
                vinkki = new Podcast(nimi);
            }
            vinkki.setKuvaus(kuvaus);
            vinkit.lisaa(vinkki);

            vinkit.listaaVinkit();
        }
    
    }
 
}
