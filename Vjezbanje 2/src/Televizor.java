/*Napisati klasu Televizor sa atributima: brojKanala (int, mora biti ≥ 1), nazivKanala 
(String), jacinaTona (int, između 0 i 10). Potrebno je odraditi:  
a. Konstruktor koji postavlja početne vrijednosti atributa.  
b. Getere i setere za sve atribute (sa provjerama da broj kanala ≥ 1 i da je jačina 
tona u opsegu 0–10).  
c. Metod pojacajTon() koji uvećava jačinu tona za 1, ali ne može preći 10.  
d. Metod ispisi() koji ispisuje broj kanala, naziv kanala i trenutnu jačinu tona.*/
public class Televizor {
int brojKanala;
String nazivKanala;
int jacinaTona;
//Kontruktor koji postavlja pocetne vrijednosti 
public Televizor(int brojKanala,String nazivKanala,int jacinaTona) {
setbrojKanala(brojKanala);
this.nazivKanala = nazivKanala;
setJacinaTona(jacinaTona);
}


	private void setJacinaTona(int jacinaTona2) {
	// TODO Auto-generated method stub
	
}


	
private void setbrojKanala(int brojKanala2) {
	//Geteri i seteri sa provjerama 
	
	
}


public int getBrojKanala() {
	return brojKanala;
}


public void setBrojKanala(int brojKanala) {
	if(brojKanala<1)
		System.out.print("Broj kanala mora biti veci od jedinice");
	this.brojKanala = brojKanala;
}


public String getNazivKanala() {
	return nazivKanala;
}


public void setNazivKanala(String nazivKanala) {
	this.nazivKanala = nazivKanala;
}


public int getJacinaTona() {
	if(jacinaTona<0 && jacinaTona>10) {
		System.out.print("Jacina tona mora biti izmedju 0 i 10");
	}
	return jacinaTona;
}


//Metod za pojačavanje tona
public void pojacajTon() {
    if (jacinaTona < 10) {
        jacinaTona++;
    }
}
//Metod za ispis informacija o televizoru
public void ispisi() {
    System.out.println("Broj kanala: " + brojKanala);
    System.out.println("Naziv kanala: " + nazivKanala);
    System.out.println("Trenutna jačina tona: " + jacinaTona);
}}