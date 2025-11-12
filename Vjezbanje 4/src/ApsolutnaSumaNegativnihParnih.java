/*Napisati program koji na osnovu niza cijelih brojeva računa apsolutnu sumu 
svih negativnih parnih elemenata za unijeti niz. Štampati sumu.*/
import java.util.Scanner;

public class ApsolutnaSumaNegativnihParnih {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

       
        int apsolutnaSuma = racunajApsolutnuSumu(niz);

       
        System.out.println("Apsolutna suma svih negativnih parnih elemenata u nizu je: " + apsolutnaSuma);
    }

    public static int racunajApsolutnuSumu(int[] niz) {
        int suma = 0;
        for (int broj : niz) {
            if (broj < 0 && broj % 2 == 0) {
                suma += Math.abs(broj); 
            }
        }
        return suma;
    }
}


