/*Napisati program koji za unijeti niz elemenata (cijeli brojevi) a uvećava svaki 
parni element za vrijednost x. Parametar x je prirodan broj*/
import java.util.Scanner;

public class UvecajParneElemente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        System.out.print("Unesite vrijednost x (prirodan broj): ");
        int x = scanner.nextInt();
        
        
        while (x <= 0) {
            System.out.print("Molimo unesite prirodan broj za x: ");
            x = scanner.nextInt();
        }

        
        uvecajParne(niz, x);

        
        System.out.println("Niz nakon uvećanja parnih elemenata:");
        for (int broj : niz) {
            System.out.print(broj + " ");
        }
    }

    public static void uvecajParne(int[] niz, int x) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) { // Provjeravamo da li je broj paran
                niz[i] += x; // Uvećavamo parni broj za x
            }
        }
    }
}
