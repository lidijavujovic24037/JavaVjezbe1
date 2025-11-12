/*Kreirati klasu Destinacija sa atributima: naziv, drzava, ocjena (0–10),
udaljenostKm, brojPosjeta i odgovarajućim geterima, seterima i
konstruktorom. U glavnoj klasi kreirati ArrayList<Destinacija> sa nekoliko
destinacija. Napisati metode koje:
a. pronalaze sve destinacije sa ocjenom većom od 8 koje su bliže od
1000 km,
b. pronalaze destinaciju sa najvećim brojem posjeta,
c. sortiraju listu po ocjeni (opadajuće).
*/
public class Destinacija {
    private String naziv;
    private String drzava;
    private double ocjena; // Ocjena između 0 i 10
    private double udaljenostKm; // Udaljenost u kilometrima
    private int brojPosjeta; // Broj posjeta

    // Konstruktor
    public Destinacija(String naziv, String drzava, double ocjena, double udaljenostKm, int brojPosjeta) {
        this.naziv = naziv;
        this.drzava = drzava;
        this.ocjena = ocjena;
        this.udaljenostKm = udaljenostKm;
        this.brojPosjeta = brojPosjeta;
    }

    // Getteri i setteri
    public String getNaziv() {
        return naziv;
    }

    public String getDrzava() {
        return drzava;
    }

    public double getOcjena() {
        return ocjena;
    }

    public double getUdaljenostKm() {
        return udaljenostKm;
    }

    public int getBrojPosjeta() {
        return brojPosjeta;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public void setOcjena(double ocjena) {
        if (ocjena >= 0 && ocjena <= 10) {
            this.ocjena = ocjena;
        }
    }

    public void setUdaljenostKm(double udaljenostKm) {
        this.udaljenostKm = udaljenostKm;
    }

    public void setBrojPosjeta(int brojPosjeta) {
        this.brojPosjeta = brojPosjeta;
    }
}
