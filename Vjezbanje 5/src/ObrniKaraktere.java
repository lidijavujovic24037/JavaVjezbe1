/* Napisati program kojim se učitava rečenica. Štampati rečenicu sa obrnutim redosledom 
karaktera u riječima. Primjer: Marko programira -> okraM arimargorp. Napomena: 
pogledati dokumentaciju StringBuilder klase.*/
import java.util.Scanner;

public class ObrniKaraktere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Unesite rečenicu: ");
        String recenica = scanner.nextLine();

       
        String[] rijeci = recenica.split(" ");
        
        StringBuilder rezultat = new StringBuilder();

        
        for (String rijec : rijeci) {
            StringBuilder sb = new StringBuilder(rijec);
            rezultat.append(sb.reverse().toString()).append(" ");
        }

        
        System.out.println("Rečenica sa obrnutim redosledom karaktera u riječima: " + rezultat.toString().trim());
    }
}
