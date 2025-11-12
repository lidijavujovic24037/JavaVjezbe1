/*Napisati program koji za unijeti niz a i vrijednost max vraća broj elemenata 
koji su manji od max iz tog niza. Napomena: lista sadrži samo cijele brojeve */
import java.util.Scanner;

public class BrojManjiOdMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        System.out.print("Unesite vrijednost max: ");
        int max = scanner.nextInt();

        
        int brojManjih = prebrojManjeOdMax(niz, max);

        
        System.out.println("Broj elemenata manjih od " + max + " je: " + brojManjih);
    }

    public static int prebrojManjeOdMax(int[] niz, int max) {
        int brojManjih = 0;
        for (int broj : niz) {
            if (broj < max) { 
                brojManjih++;
            }
        }
        return brojManjih;
    }
}
