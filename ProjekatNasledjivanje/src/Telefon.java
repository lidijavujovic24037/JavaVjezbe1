
public class Telefon extends EProizvodi {
private String operativni_sistem;
private int velicina_ekrana;
//Kontruktor
public Telefon(String opis_proizvoda, String sifre_proizvoda, double uvozna_cijena_proizvoda, String tip_uredjaja,
		double velicina_ekrana) {
	super(opis_proizvoda, sifre_proizvoda, uvozna_cijena_proizvoda, tip_uredjaja, velicina_ekrana);
}
//Geteri i seteri 
	


public String getOperativni_sistem() {
	return operativni_sistem;
}
public void setOperativni_sistem(String operativni_sistem) {
	this.operativni_sistem = operativni_sistem;
}
public int getVelicina_ekrana() {
	return velicina_ekrana;
}
public void setVelicina_ekrana(int velicina_ekrana) {
	this.velicina_ekrana = velicina_ekrana;
}}