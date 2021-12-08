import java.util.Scanner;

public class Kayttoliittyma {
    
    public static void start() {
    
        Scanner sc = new Scanner(System.in);
        String otsikko;
        String kuvaus;
        String tyyppi;
        LukuvinkkiInterface vinkki;
        Vinkit vinkit = new Vinkit();
        
        while (true) {

            System.out.println("'L' lukuvinkin lisäykseen, 'T' tulostaa vinkit (tyhjä lopettaa)");
            String komento = sc.nextLine();
            if (komento.equals("")) {
                break;
            }

            if (komento.equals("L")){
                System.out.println("Anna lukuvinkin otsikko (tyhjä lopettaa):");
                otsikko = sc.nextLine();
                if (otsikko.equals("")) {
                    break;
                }

                System.out.println("Lukuvinkin tyyppi (K = Kirja, P = Podcast, muu lopettaa): ");
                tyyppi = sc.nextLine();
                if (!tyyppi.equals("K") && !tyyppi.equals("P")) {
                    break;
                }

                System.out.println("Lukuvinkin kuvaus: ");
                kuvaus = sc.nextLine();
                if (tyyppi.equals("K")) {
                    vinkki = new Kirja(otsikko);
                } else {
                    vinkki = new Podcast(otsikko);
                }
                vinkki.setKuvaus(kuvaus);
                vinkit.lisaa(vinkki);
            }

            if (komento.equals("T"))
            vinkit.listaaVinkit();
        }
    
    }
 
}
