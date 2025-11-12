/* Napisati program koji za unijeti string s (karakteri stringa cifre od 0 do 9) enkriptuje na 
sledeći način: ako je karakter paran broj pretvara se u 0, a ako je karakter neparan broj 
pretvara se u 1. Npr. za s = ‘15023’ rezultat je 11001.*/
import java.util.Scanner;

public class EnkripcijaStringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Unesite string (samo cifre od 0 do 9): ");
        String s = scanner.nextLine();
        
      
        StringBuilder rezultat = new StringBuilder();

        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) { 
                int cifra = Character.getNumericValue(c);
                if (cifra % 2 == 0) {
                    rezultat.append('0'); 
                } else {
                    rezultat.append('1'); 
                }
            } else {
                System.out.println("Uneseni string sadrži nevažeće karaktere. Samo cifre su dozvoljene.");
                return; 
            }
        }

       
        System.out.println("Rezultat enkripcije: " + rezultat.toString());
    }
}
