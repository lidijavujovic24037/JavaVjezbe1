/* Napisati program koji za unijeti niz elemenata (cijeli brojevi, bez nule) a vraća 
broj elemenata koji imaju suprotnu vrijednost. Broju x, suprotan broj je -x. 
Smatrati da se broj pojavljuje jednom i da nekad ima svoju suprotnu 
vrijednost, a nekad nema.  
Input 1: {1, 2, -1, 3, -3} Output: 2  
Input 2: {20, 10, -10, 100} Output: 1*/
import java.util.HashSet;
import java.util.Scanner;

public class SuprotniElementi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza (cijeli brojevi bez nule):");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        int brojSuprotnih = prebrojSuprotne(niz);

       
        System.out.println("Broj elemenata koji imaju suprotnu vrijednost je: " + brojSuprotnih);
    }

    public static int prebrojSuprotne(int[] niz) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> suprotni = new HashSet<>();

        for (int broj : niz) {
           
            set.add(broj);
            
            if (set.contains(-broj)) {
                suprotni.add(Math.abs(broj));
            }
        }

        return suprotni.size();
    }
}