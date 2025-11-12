/*(Zavisnost od prethodnog zadatka) Napisati klasu Transakcija sa atributima: iznos 
(double), tip (String: "uplata" ili "isplata"), opis (String). Potrebno je odraditi: 
a. Konstruktor; getere/setere (iznos ≥ 0).  
b. Metod jeUplata() koji vraća true ako je tip "uplata".  
Napisati glavnu klasu App (naziv fajla) koja kreira jedan BankovniRacun i dvije 
Transakcija (uplata i isplata). Na osnovu jeUplata() poziva uplati ili isplati sa iznosom 
transakcije.*/
public class Transakcija {
	private double iznos;
    private String tip; // "uplata" ili "isplata"
    private String opis;

    // Konstruktor
    public Transakcija(double iznos, String tip, String opis) {
        if (iznos < 0) {
            throw new IllegalArgumentException("Iznos mora biti ≥ 0.");
        }
        this.iznos = iznos;
        this.tip = tip;
        this.opis = opis;
    }
 // Getere
    public double getIznos() {
        return iznos;
    }

    public String getTip() {
        return tip;
    }

    public String getOpis() {
        return opis;
    }
 // Setere
    public void setIznos(double iznos) {
        if (iznos < 0) {
            throw new IllegalArgumentException("Iznos mora biti ≥ 0.");
        }
        this.iznos = iznos;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    // Metod jeUplata
    public boolean jeUplata() {
        return "uplata".equalsIgnoreCase(tip);
    }
}
