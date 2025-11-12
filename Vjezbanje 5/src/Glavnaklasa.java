//destinacija
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Glavnaklasa {
    public static void main(String[] args) {
        // Kreiranje liste destinacija
        List<Destinacija> destinacije = new ArrayList<>();
        destinacije.add(new Destinacija("Pariz", "Francuska", 9.5, 300, 150));
        destinacije.add(new Destinacija("New York", "SAD", 8.0, 6000, 200));
        destinacije.add(new Destinacija("Beč", "Austrija", 8.5, 800, 100));
        destinacije.add(new Destinacija("Tokio", "Japan", 9.0, 10000, 50));
        destinacije.add(new Destinacija("Sarajevo", "BiH", 7.5, 200, 300));
        destinacije.add(new Destinacija("Barcelona", "Španija", 9.0, 1000, 250));

        // a. Pronalazak svih destinacija sa ocjenom većom od 8 koje su bliže od 1000 km
        List<Destinacija> visokeOcjene = pronadjiVisokeOcjene(destinacije);
        System.out.println("Destinacije sa ocjenom većom od 8 i udaljenošću manjom od 1000 km:");
        for (Destinacija d : visokeOcjene) {
            System.out.println(d.getNaziv() + ", " + d.getDrzava() + ", Ocjena: " + d.getOcjena());
        }

        // b. Pronalazak destinacije sa najvećim brojem posjeta
        Destinacija najposjecenija = pronadjiNajposjeceniju(destinacije);
        if (najposjecenija != null) {
            System.out.println("Destinacija sa najvećim brojem posjeta: " + najposjecenija.getNaziv() +
                    ", Broj posjeta: " + najposjecenija.getBrojPosjeta());
        }

        // c. Sortiranje liste po ocjeni (opadajuće)
        destinacije.sort(Comparator.comparingDouble(Destinacija::getOcjena).reversed());
        System.out.println("Destinacije sortirane po ocjeni (opadajuće):");
        for (Destinacija d : destinacije) {
            System.out.println(d.getNaziv() + ", Ocjena: " + d.getOcjena());
        }
    }

    // Metoda za pronalazak destinacija sa ocjenom većom od 8 i udaljenošću manjom od 1000 km
    public static List<Destinacija> pronadjiVisokeOcjene(List<Destinacija> destinacije) {
        List<Destinacija> rezultat = new ArrayList<>();
        for (Destinacija d : destinacije) {
            if (d.getOcjena() > 8 && d.getUdaljenostKm() < 1000) {
                rezultat.add(d);
            }
        }
        return rezultat;
    }

    // Metoda za pronalazak destinacije sa najvećim brojem posjeta
    public static Destinacija pronadjiNajposjeceniju(List<Destinacija> destinacije) {
        Destinacija najposjecenija = null;
        for (Destinacija d : destinacije) {
            if (najposjecenija == null || d.getBrojPosjeta() > najposjecenija.getBrojPosjeta()) {
                najposjecenija = d;
            }
        }
        return najposjecenija;
    }
}
