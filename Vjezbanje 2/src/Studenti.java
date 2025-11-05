/*Kreirati jednostavan program za potrebe studentske službe. U sistemu je potrebno 
omogućiti upravljanje podacima o studentima (ime, prezime, broj indeksa i dodati tri 
ocjene).  
a. U testnoj klasi potrebno je dodati nove studente i informacije o njima.  
b. Na osnovu unešenih ocjena potrebno je izračunati prosječnu ocjenu i na 
osnovu prosjeka odrediti da li student može ostvariti pravo na studentski 
kredit (prosjek veći od 9).  
c. 
Na kraju programa, koristeći statičku promjenljivu, potrebno je odštampati 
spisak studenata u formatu: (Ime , Prezime, Stipendija (Da/Ne)). */
public class Studenti {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private int[] ocjene; // Array za tri ocjene
    private static int brojStudenata = 0; // Statistička promenljiva za broj studenata

    // Konstruktor
    public Studenti(String ime, String prezime, String brojIndeksa, int ocjena1, int ocjena2, int ocjena3) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.ocjene = new int[] {ocjena1, ocjena2, ocjena3};
        brojStudenata++; // Povećavamo broj studenata
    }
// Metoda za izračunavanje prosečne ocjene
public double izracunajProsjek() {
    int suma = 0;
    for (int ocjena : ocjene) {
        suma += ocjena;
    }
    return suma / (double) ocjene.length; // Vraćamo prosečnu ocjenu
}

// Metoda za proveru prava na stipendiju
public boolean imaPravoNaStipendiju() {
    return izracunajProsjek() > 9; // Prosečna ocjena mora biti veća od 9
}

// Staticka metoda za dobijanje broja studenata
public static int getBrojStudenata() {
    return brojStudenata;
}

//Getter za ispis
public String toString() {
    return ime + " " + prezime + ", Stipendija: " + (imaPravoNaStipendiju() ? "Da" : "Ne");
}
}