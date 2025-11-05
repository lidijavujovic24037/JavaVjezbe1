/* Kreirati klasu Zaposleni koja ima sledeće atribute: ime, prezime, godine_staza, 
plata. Voditi računa koji tipovi podataka se vezuju za navedene atribute. Obavezno 
je  kreirati konstruktor kojim se objekat klase može kreirati.  
a. Kreirati getter i setter metode kojima se može pristupiti određenom 
atributu objekta, kao i eventualno taj atribut izmijeniti (pomoću seter 
metode).  
b. Klasa Zaposleni mora da sadrži metodu koja vrši ispisivanje zaposlenih (Ime 
i prezime, godine staza).  
c. Kreirati makar 5 objekata klase Zaposleni i testirati getter i setter metode, 
kao i ispis Zaposlenih (ispis objekta klase).  
d. U klasi Zaposleni potrebno je napraviti metodu koja će ispisati ime 
zaposlenog koji ima najveću platu.  
e. Potrebno je dodati i metodu koja će provjeriti iznos plate i ako je manja od 
800 uvećaće je 6 posto u slučaju da zaposleni ima preko 10 godina staža*/

public class Zaposleni {
private String ime;
private String prezime;
private int godineStaza;
private double plata;
//Konstruktor
public Zaposleni(String ime,String prezime,int godineStaza,double plata) {
	this.ime = ime; 
    this.prezime = prezime; 
    this.godineStaza = godineStaza; 
    this.plata = plata; 
} 
//Geteri i seteri 
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	this.ime = ime;
}
public String getPrezime() {
	return prezime;
}
public void setPrezime(String prezime) {
	this.prezime = prezime;
}
public int getGodineStaza() {
	return godineStaza;
}
public void setGodineStaza(int godineStaza) {
	if(godineStaza>0)
	this.godineStaza = godineStaza;
	else {
		System.out.print("Godine staza ne mogu biti negativne");;
}}
public double getPlata() {
	return plata;
}
public void setPlata(double plata) {
	if(plata>0)
	this.plata = plata;
	else {
		System.out.print("Plata ne moze biti negativna");
	}
}
//provjera za uvecanje plate 
public void provjeriIPovecajPlatuAkoTreba() { 
    if (plata < 800 && godineStaza > 10) { 
        double stara = plata; 
        plata = plata * 1.06; 
      
    } 
} 
}

