/* Dvorac se nalazi u centru na koordinatama (0, 0). Na polju je N neprijateljskih 
katapulta. Katapult može da pogodi dvorac ako mu je Manhattan rastojanje do 
centra manje ili jednako određenoj vrijednosti D. 
Potrebno je odrediti koliko katapulta predstavlja prijetnju. Osim toga, 
provjeriti da li će katapulti koji predstavljaju prijetnju srušiti dvorac 
ispaljivanjem po jednog hica, ako je poznato za dvorac da ima health HD, a da 
je za svaki katapult ima istu vrijednost napada KA (zbir svih KA iz dometa >= 
HD)*/
import java.util.Scanner;
public class Dvorac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int N = sc.nextInt(); // Broj katapulta
	        long D = sc.nextLong(); // Maksimalno Manhattan rastojanje
	        long HD = sc.nextLong(); // Zdravlje dvorca
	        long KA = sc.nextLong(); // Vrednost napada katapulta
	        int brojprijetnji = 0; // Broj katapulta koji predstavljaju pretnju
	        for (int i = 0; i < N; i++) {
	            long x = sc.nextLong(); // X koordinata katapulta
	            long y = sc.nextLong(); // Y koordinata katapulta

	            long menheten = Math.abs(x) + Math.abs(y); // Izračunavanje Manhattan rastojanja

	            if (menheten <= D) {
	                brojprijetnji++; // Povećanje broja pretnji
	            }
	        }

	        long totalDamage = brojprijetnji * KA; // Ukupna šteta
	        

	        // Ispis broja katapulta koji predstavljaju pretnju
	        System.out.printf("Naš dvorac ukupno ugrožava: %d\n", brojprijetnji);

	        // Proveravanje da li dvorac može biti srušen
	        if (totalDamage >= HD) {
	            System.out.printf("Dvorac je srušen, ukupna šteta je: %d\n", totalDamage);
	        } else {
	            System.out.printf("Dvorac nije srušen, ukupna šteta je: %d\n", totalDamage);
	        }

	        sc.close(); // Zatvaranje skenera
	    }
	


	}


