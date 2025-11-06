public class Racunari  extends EProizvodi  {
private String procesor;
private int memorija;
//Kontruktor 
public Racunari(String opis_proizvoda, String sifre_proizvoda, double uvozna_cijena_proizvoda, String tip_uredjaja,
		double velicina_ekrana) {
	super(opis_proizvoda, sifre_proizvoda, uvozna_cijena_proizvoda, tip_uredjaja, velicina_ekrana);
//Geteri i seteri 
	
}
public String getProcesor() {
	return procesor;
}
public void setProcesor(String procesor) {
	this.procesor = procesor;
}
public int getMemorija() {
	return memorija;
}
public void setMemorija(int memorija) {
	this.memorija = memorija;
}

	
}