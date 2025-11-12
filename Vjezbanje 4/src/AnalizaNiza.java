/*Kreirati klasu AnalizaNiza koja sadrži metodu nadjiParniPozitivniProsjek koja prima niz 
cijelih brojeva i izračunava prosječnu vrijednost svih pozitivnih parnih brojeva u nizu. 
U testnoj klasi omogućiti korisniku da unese elemente niza, a zatim koristeći kreiranu 
metodu izračunati i ispisati prosječnu vrijednost parnih brojeva unijetog niza*/
import java.util.Scanner;

class AnalizaNiza {
    public static double nadjiParniPozitivniProsjek(int[] niz) {
        int suma = 0;
        int brojParnih = 0;

        for (int broj : niz) {
            if (broj > 0 && broj % 2 == 0) {
                suma += broj;
                brojParnih++;
            }
        }

        return brojParnih > 0 ? (double) suma / brojParnih : 0; // Vraća 0 ako nema pozitivnih parnih brojeva
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        double prosjek = AnalizaNiza.nadjiParniPozitivniProsjek(niz);
        System.out.printf("Prosječna vrijednost pozitivnih parnih brojeva: %.2f%n", prosjek);
    }
}