/*Dat je niz koji sadrži broj posjeta za poslednjih deset fudbalskih utakmica. Napisati 
program koji štampa koliko je bilo najviše posjeta u jednom danu.*/
public class MaxNiz {
	public static void main(String[] args) { 
		// Niz sa brojem posjeta (možeš kasnije omogućiti i unos) 
		int[] posjete = {1200, 3400, 2800, 4100, 3900, 4500, 3200, 
		4700, 2900, 4300}; 
		int maxPosjeta = posjete[0]; // pretpostavimo da je prva najveca 
		// Prolazak kroz niz i traženje najveće vrijednosti 
		for (int i = 1; i < posjete.length; i++) { //krecemo od drugogo elementa jer je 1 najveci 
		if (posjete[i] > maxPosjeta) { 
		maxPosjeta = posjete[i]; 
		} 
		} 
		System.out.println("Najveći broj posjeta bio je: " + 
		maxPosjeta);
}
}