
public class Vozila {

private String proizvodjac;
private int godinaProizvodnje;
private double kubikaza;
private String boja;
//Konstruktor
public void Vozila(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja) {
    this.proizvodjac = proizvodjac;
    this.godinaProizvodnje = godinaProizvodnje;
    this.kubikaza = kubikaza;
    this.boja = boja;
}
 double izracunajCijenuRegistracije() {
    	   double cijena = 100;

    	  if (godinaProizvodnje < 2010) {
    	   cijena += 30;
    	  }

    	  if (kubikaza > 2000) {
    	   cijena += 50;
    	  }

    	  return cijena;
 }
    //Geteri i seteri

	
public String getProizvodjac() {
	return proizvodjac;
}
public void setProizvodjac(String proizvodjac) {
	this.proizvodjac = proizvodjac;
}
public int getGodinaProizvodnje() {
	return godinaProizvodnje;
}
public void setGodinaProizvodnje(int godinaProizvodnje) {
	this.godinaProizvodnje = godinaProizvodnje;
}
public double getKubikaza() {
	return kubikaza;
}
public void setKubikaza(double kubikaza) {
	this.kubikaza = kubikaza;
}
public String getBoja() {
	return boja;
}
public void setBoja(String boja) {
	this.boja = boja;
}}

    









