/*Napisati program koji korisniku omogućava unos dužine niza, a zatim i elemente niza. 
Svaki element predstavlja broj bodova ostvarenih na ispitu. Nakon unosa potrebno je 
odštampati prosječnu broj bodova i najmanji element u nizu (vrijednost i indeks)*/
import java.util.Scanner;

public class AnalizaBodova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite dužinu niza: ");
        int n = scanner.nextInt();
        int[] bodovi = new int[n];

        System.out.println("Unesite elemente niza (bodove):");
        for (int i = 0; i < n; i++) {
            bodovi[i] = scanner.nextInt();
        }

        double prosjek = izracunajProsjek(bodovi);
        int[] najmanjiElement = nadjiNajmanji(bodovi);

        System.out.printf("Prosječna vrijednost bodova: %.2f%n", prosjek);
        System.out.println("Najmanji element: " + najmanjiElement[0] + " na indeksu " + najmanjiElement[1]);
    }

    public static double izracunajProsjek(int[] bodovi) {
        double suma = 0;
        for (int bod : bodovi) {
            suma += bod;
        }
        return suma / bodovi.length;
    }

    public static int[] nadjiNajmanji(int[] bodovi) {
        int najmanji = bodovi[0];
        int indeks = 0;

        for (int i = 1; i < bodovi.length; i++) {
            if (bodovi[i] < najmanji) {
                najmanji = bodovi[i];
                indeks = i;
            }
        }
        return new int[]{najmanji, indeks};
    }
}