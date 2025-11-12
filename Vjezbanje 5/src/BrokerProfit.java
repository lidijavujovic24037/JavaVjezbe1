/*Napisati program koji za unijeti string provjerava da li je broker u plusu ili 
minus nakon trgovine akcijama. Prefiks stringa sadrzi S kada je odradjena 
prodaja, a B kada je odradjena kupovina akcija. 
Ulaz: a = “S50 S40 B50 B100”;*/
import java.util.Scanner;

public class BrokerProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Unesite string sa trgovinama: ");
        String a = scanner.nextLine();
        
        String[] transakcije = a.split(" ");
        int saldo = 0;

        for (String transakcija : transakcije) {
            char tip = transakcija.charAt(0);
            int iznos = Integer.parseInt(transakcija.substring(1));

            if (tip == 'S') {
                saldo += iznos; 
            } else if (tip == 'B') {
                saldo -= iznos; 
            }
        }

        System.out.println("Saldo: " + saldo);
    }
}
