/*Kreirati program koji će korisniku omogućiti unos dužine niza i unos elemenata tog 
niza, a nakon toga:
 ► Prikazati sortiran niz (bubble sort dodatno objašnjenje na linku)
 ► Omogućiti korisniku da unese broj i provjeriti da li broj postoji u nizu i štampati 
odgovarajuću poruku*/
import java.util.Scanner;

public class SortiranjeNiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite dužinu niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        bubbleSort(niz);

        System.out.println("Sortiran niz:");
        for (int broj : niz) {
            System.out.print(broj + " ");
        }
        System.out.println();

        System.out.print("Unesite broj za pretragu: ");
        int brojZaPretragu = scanner.nextInt();
        if (proveriPostojanje(niz, brojZaPretragu)) {
            System.out.println("Broj " + brojZaPretragu + " postoji u nizu.");
        } else {
            System.out.println("Broj " + brojZaPretragu + " ne postoji u nizu.");
        }
    }

    public static void bubbleSort(int[] niz) {
        int n = niz.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (niz[j] > niz[j + 1]) {
                    // Swap
                    int temp = niz[j];
                    niz[j] = niz[j + 1];
                    niz[j + 1] = temp;
                }
            }
        }
    }

    public static boolean proveriPostojanje(int[] niz, int broj) {
        for (int i : niz) {
            if (i == broj) {
                return true;
            }
        }
        return false;
    }
}
