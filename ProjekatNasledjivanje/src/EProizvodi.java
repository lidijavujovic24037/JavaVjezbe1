import java.util.ArrayList;
import java.util.List;

public class EProizvodi {
    private String opis_proizvoda;
    private String sifre_proizvoda;
    private double uvozna_cijena_proizvoda;
    private String tip_uredjaja; 
    private double velicina_ekrana;

    // Konstruktor
    public EProizvodi(String opis_proizvoda, String sifre_proizvoda, double uvozna_cijena_proizvoda, String tip_uredjaja, double velicina_ekrana) {
        this.opis_proizvoda = opis_proizvoda;
        this.sifre_proizvoda = sifre_proizvoda;
        this.uvozna_cijena_proizvoda = uvozna_cijena_proizvoda;
        this.tip_uredjaja = tip_uredjaja;
        this.velicina_ekrana = velicina_ekrana;
    }

    // Geteri i setteri
    public String getOpis_proizvoda() {
        return opis_proizvoda;
    }

    public void setOpis_proizvoda(String opis_proizvoda) {
        this.opis_proizvoda = opis_proizvoda;
    }

    public String getSifre_proizvoda() {
        return sifre_proizvoda;
    }

    public void setSifre_proizvoda(String sifre_proizvoda) {
        this.sifre_proizvoda = sifre_proizvoda;
    }

    public double getUvozna_cijena_proizvoda() {
        return uvozna_cijena_proizvoda;
    }

    public void setUvozna_cijena_proizvoda(double uvozna_cijena_proizvoda) {
        this.uvozna_cijena_proizvoda = uvozna_cijena_proizvoda;
    }

    public String getTipUredjaja() {
        return tip_uredjaja;
    }

    public double getVelicinaEkrana() {
        return velicina_ekrana;
    }

    // Metoda za obračun maloprodajne cijene
    public double izracunajMaloprodajnuCijenu() {
        double maloprodajnaCijena = uvozna_cijena_proizvoda * 1.05; // 

        switch (tip_uredjaja) {
            case "racunar":
                uvozna_cijena_proizvoda *= 1.05; 
                break;
            case "telefon":
                if (velicina_ekrana > 6) {
                    uvozna_cijena_proizvoda *= 1.03; 
                }
                break;
            case "tv":
                if (velicina_ekrana > 65) {
                    uvozna_cijena_proizvoda *= 1.10; 
                }
                break;
        }
        return uvozna_cijena_proizvoda;
    }
 // Metoda za filtriranje proizvoda po tipu
    public static List<EProizvodi> filtrirajProizvode(List<EProizvodi> proizvodi, String tipUredjaja) {
        List<EProizvodi> filtriraniProizvodi = new ArrayList<>();
        for (EProizvodi proizvod : proizvodi) {
            if (proizvod.getTipUredjaja().equalsIgnoreCase(tipUredjaja)) {
                filtriraniProizvodi.add(proizvod);
            }
        }
        return filtriraniProizvodi;
}}

