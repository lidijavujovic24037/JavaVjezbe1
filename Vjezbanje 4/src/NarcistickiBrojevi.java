/* U nizu cijelih brojeva koje zadaje koristnik provjeriti koliko je onih koji su 
Narcistic (broj jednak zbiru cifara stepena duzine broja, primjer 153).*/
import java.util.Scanner;

public class NarcistickiBrojevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        int brojNarcistickih = prebrojNarcisticke(niz);

        
        System.out.println("Broj Narcističkih brojeva u nizu je: " + brojNarcistickih);
    }

    public static int prebrojNarcisticke(int[] niz) {
        int brojNarcistickih = 0;

        for (int broj : niz) {
            if (jeNarcisticki(broj)) {
                brojNarcistickih++;
            }
        }

        return brojNarcistickih;
    }

    public static boolean jeNarcisticki(int broj) {
        int original = broj;
        int zbirCifara = 0;
        int duzina = String.valueOf(broj).length(); 

        while (broj != 0) {
            int cifra = broj % 10;
            zbirCifara += Math.pow(cifra, duzina); 
            broj /= 10; 
        }

        return zbirCifara == original; 
    }
}
