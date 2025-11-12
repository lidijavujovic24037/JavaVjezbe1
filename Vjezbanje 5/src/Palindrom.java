import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite riječ: ");
        String rijec = scanner.nextLine();

        // Uklanjanje razmaka i konvertovanje u mala slova
        String rijecBezRazmaka = rijec.replaceAll("\\s+", "").toLowerCase();

        // Koristeći StringBuilder za provjeru palindroma
        StringBuilder sb = new StringBuilder(rijecBezRazmaka);
        String obrnutaRijec = sb.reverse().toString();

        // Provjera da li je riječ palindrom
        if (rijecBezRazmaka.equals(obrnutaRijec)) {
            System.out.println("Unesena riječ je palindrom.");
        } else {
            System.out.println("Unesena riječ nije palindrom.");
        }
    }
}
