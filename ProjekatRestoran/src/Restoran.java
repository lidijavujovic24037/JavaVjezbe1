import java.util.ArrayList;
import java.util.List;

class Restoran {
    private String naziv;
    private String adresa;
    private String pib;
    private List<Zaposleni> zaposleni;
    private List<ObracunPlate> obračuni;

    public Restoran(String naziv, String adresa, String pib) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.pib = pib;
        this.zaposleni = new ArrayList<>();
        this.obračuni = new ArrayList<>(); 
    }

    

    public void generisiMesečniObračun(int mesec, int godina) {
        System.out.printf("%-10s %-20s %-10s %-15s %-10s %-10s\n", "ID", "Ime i Prezime", "Tip", "Radni sati", "Prekovremeni", "Plata");
        System.out.println("----------------------------------------------------------------------------");
        for (Zaposleni zaposlen : zaposleni) {
            String tip = zaposlen.getTip();
            String prekovremeni = (zaposlen instanceof Konobar) ? String.valueOf(((Konobar) zaposlen).getPrekovremeniSati()) : "-";
            double plata = zaposlen.izracunajPlatu();
            System.out.printf("%-10d %-20s %-10s %-15d %-10s %-10.2f\n",
                    zaposlen.id, zaposlen.prezime, tip, zaposlen.radniSati, prekovremeni, plata);
            
            // Dodavanje obračuna u listu
            String napomena = "";
            if (zaposlen instanceof Menadžer) {
                napomena = "Bonus " + ((Menadžer) zaposlen).bonus + " evra";
            } else if (zaposlen instanceof Konobar) {
                napomena = "Prekovremeni rad " + ((Konobar) zaposlen).getPrekovremeniSati() + " sati";
            }
            obračuni.add(new ObracunPlate(mesec, godina, zaposlen, plata, napomena));
        }
    }

    public void prikaziObracune() {
        System.out.println("Istorija obračuna plata:");
        for (ObracunPlate obračun : obračuni) {
            System.out.println(obračun);
        }
    }

   
}