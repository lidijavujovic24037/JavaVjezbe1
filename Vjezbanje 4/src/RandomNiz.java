/* Kreirati program koji ce kreirati novi niz, korisnik unosi dužinu niza a nakon toga: 
► Popuniti niz sa random vrijednostima i prikazati ga.
 ► Izmijeniti svaki parni element niza da bude njegova suprotna vrijednost (-1*n), a svaki 
neparni pretvoriti u njegovu inverznu vrijednost (1/n).*/
import java.util.Random;
import java.util.Scanner;

public class RandomNiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Unesite dužinu niza: ");
        int n = scanner.nextInt();
        double[] niz = new double[n];

        // Popunjavanje niza sa random vrijednostima
        System.out.println("Niz sa random vrijednostima:");
        for (int i = 0; i < n; i++) {
            niz[i] = random.nextDouble() * 100; // Random vrijednosti između 0 i 100
            System.out.print(niz[i] + " ");
        }
        System.out.println();

        // Izmjena parnih i neparnih elemenata
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                niz[i] = -niz[i]; // Parni elementi postaju suprotne vrijednosti
            } else {
                niz[i] = 1 / niz[i]; // Neparni elementi postaju inverzne vrijednosti
            }
        }

        // Ispis izmijenjenog niza
        System.out.println("Izmijenjeni niz:");
        for (double broj : niz) {
            System.out.print(broj + " ");
        }
    }
}