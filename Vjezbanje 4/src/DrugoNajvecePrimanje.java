/*Kreirati program koji nalazi platu zaposlenog koji ima drugo najveće primanje. 
Npr. ako je plate = {540,690, 900} rezultat je 690. Napomena: lista ima bar 2 
elementa. */
import java.util.Arrays;
import java.util.Scanner;

public class DrugoNajvecePrimanje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj zaposlenih: ");
        int n = scanner.nextInt();
        double[] plate = new double[n];

        System.out.println("Unesite plate zaposlenih:");
        for (int i = 0; i < n; i++) {
            plate[i] = scanner.nextDouble();
        }

        double drugoNajvecePrimanje = pronadjiDrugoNajvecePrimanje(plate);
        System.out.printf("Drugo najveće primanje je: %.2f%n", drugoNajvecePrimanje);
    }

    public static double pronadjiDrugoNajvecePrimanje(double[] plate) {
        Arrays.sort(plate);
        
        
        return plate[plate.length - 2];
    }
}
