/*Napisati klasu BankovniRacun sa atributima: imeVlasnika, stanje (double).  
a. Kreirati konstruktor, getere i setere.  
b. Dodati metod uplati(double iznos) koji povećava stanje.  
c. Dodati metod isplati(double iznos) koji smanjuje stanje samo ako ima 
dovoljno sredstava.  
d. Dodati metod ispisi() koji prikazuje trenutno stanje računa. */
public class BankovniRacun {
	private String imeVlasnika;
    private double stanje;

    // Konstruktor
    public BankovniRacun(String imeVlasnika, double stanje) {
        this.imeVlasnika = imeVlasnika;
        this.stanje = stanje;
    }

    // Getere
    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public double getStanje() {
        return stanje;
    }
 // Setere
    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    // Metod za uplatu
    public void uplati(double iznos) {
        if (iznos > 0) {
            stanje += iznos;
            System.out.println("Uplata od " + iznos + " je uspešna.");
        } else {
            System.out.println("Iznos za uplatu mora biti pozitivan.");
        }
    }
 // Metod za isplatu
    public void isplati(double iznos) {
        if (iznos > 0) {
            if (stanje >= iznos) {
                stanje -= iznos;
                System.out.println("Isplata od " + iznos + " je uspešna.");
            } else {
                System.out.println("Nedovoljno sredstava na računu.");
            }
        } else {
            System.out.println("Iznos za isplatu mora biti pozitivan.");
        }
    }

    // Metod za ispis stanja
    public void ispisi() {
        System.out.println("Trenutno stanje računa " + imeVlasnika + ": " + stanje);
    }
}


