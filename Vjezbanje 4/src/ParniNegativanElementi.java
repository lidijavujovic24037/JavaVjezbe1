//Napisati program koji prikazuje samo parne negativne elemente unijetog niza
import java.util.Scanner;

public class ParniNegativanElementi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        System.out.println("Parni negativni elementi u nizu su:");
        prikaziParneNegativne(niz);
    }

    public static void prikaziParneNegativne(int[] niz) {
        for (int broj : niz) {
            if (broj < 0 && broj % 2 == 0) {
                System.out.println(broj);
            }
        }
    }
}

