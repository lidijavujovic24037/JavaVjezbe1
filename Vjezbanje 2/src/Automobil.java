//Napisati klasu Automobil sa atributima: marka, model, godiste i brzina (int). 
public class Automobil {
	//atributi
	private int marka;
	private int model;
	private int godiste;
	private int brzine;
	//Kontruktor 
	public Automobil(int marka, int model, int godiste, int brzine) {
		this.marka = marka;
		this.model = model;
		this.godiste = godiste;
		this.brzine = brzine;
	}
	//Geteri i seteri
	public int getMarka() {
		return marka;
	}
	public void setMarka(int marka) {
		this.marka = marka;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		if(godiste>1855) {
		this.godiste = godiste;
		}else {
			System.out.println("Nevazeca godina proizvodnje.");
		}
	}
	public int getBrzine() {
		return brzine;
	}
	public void setBrzine(int brzine) {
		if (brzine >= 0 && brzine <= 200) {
		this.brzine = brzine;
	}else if (brzine > 200) {
		this.brzine = 200;
        System.out.println("Brzina je postavljena na maksimalnu vrednost: 200 km/h.");
    } else {
        System.out.println("Brzina ne može biti negativna.");
    }
}
	
//Metoda za ubrzanje
public void ubrzaj(int vrijednost) {
    setBrzine(brzine + vrijednost); // Koristimo seter za proveru
}

// Metoda za usporavanje
public void uspori(int vrijednost) {
    setBrzine(brzine - vrijednost); // Koristimo seter za proveru
}

// Metoda za ispis informacija o automobilu
public void ispisi() {
    System.out.printf("Marka: %s, Model: %s, Godište: %d, Brzine: %d km/h\n", marka, model, godiste, brzine);
}
}
	
	


