//Unijeti dva stringa i ispitati da li su ista bez obzira na veličinu slova
import java.util.Scanner;

public class UporedjivanjeStringova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Unesite prvi string: ");
        String prviString = scanner.nextLine();

       
        System.out.print("Unesite drugi string: ");
        String drugiString = scanner.nextLine();

        
        if (prviString.equalsIgnoreCase(drugiString)) {
            System.out.println("Stringovi su isti.");
        } else {
            System.out.println("Stringovi nisu isti.");
        }
    }
}
