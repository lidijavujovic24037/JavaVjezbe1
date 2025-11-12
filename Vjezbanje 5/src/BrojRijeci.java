//Unijeti rečenicu koja sadrži više riječi odvojenih prazninama i odrediti broj riječi
import java.util.Scanner;

public class BrojRijeci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite rečenicu: ");
        String recenica = scanner.nextLine();

        // Uklanjanje viška praznina i deljenje rečenice na reči
        String[] rijeci = recenica.trim().split("\\s+");

        // Broj reči
        int brojRijeci = rijeci.length;

        System.out.println("Broj riječi u rečenici: " + brojRijeci);
    }
}
