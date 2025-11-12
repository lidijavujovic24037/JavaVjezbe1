/*Dat je niz koji sadrži cijene proizvoda u jednom marketu. Market je za ovu 
nedelju odlučio da spusti cijene svim proizvodima. Kolika će zarada marketa 
od tih proizvoda biti manja u odnosu na originalnu cijenu*/
import java.util.Scanner;

public class SmanjenaZaradaMarketa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj proizvoda: ");
        int n = scanner.nextInt();
        double[] originalneCijene = new double[n];
        double[] snizeneCijene = new double[n];

        System.out.println("Unesite originalne cijene proizvoda:");
        for (int i = 0; i < n; i++) {
            originalneCijene[i] = scanner.nextDouble();
        }

        System.out.println("Unesite snižene cijene proizvoda:");
        for (int i = 0; i < n; i++) {
            snizeneCijene[i] = scanner.nextDouble();
        }

        // Računanje smanjene zarade
        double smanjenaZarada = izracunajSmanjenuZaradu(originalneCijene, snizeneCijene);

        // Ispis rezultata
        System.out.printf("Smanjena zarada marketa u odnosu na originalne cijene je: %.2f%n", smanjenaZarada);
    }

    public static double izracunajSmanjenuZaradu(double[] originalneCijene, double[] snizeneCijene) {
        double sumaOriginalnih = 0;
        double sumaSnizenih = 0;

        for (int i = 0; i < originalneCijene.length; i++) {
            sumaOriginalnih += originalneCijene[i];
            sumaSnizenih += snizeneCijene[i];
        }

        return sumaOriginalnih - sumaSnizenih; // Razlika između originalne i snižene zarade
    }
}
