import java.util.Scanner;

public class BrojeviOperacije {
    
  
    public static int prebrojJednocifreneNegativneBrojeve(String s) {
        int count = 0;
        String[] elementi = s.split("(?=[-+])|(?<=[-+])");

        for (String element : elementi) {
            
            if (element.startsWith("-") && element.length() == 2 && Character.isDigit(element.charAt(1))) {
                count++;
            }
        }
        return count;
    }

  
    public static int izracunaj(String izraz) {
        String[] delovi = izraz.split("(?<=[-+*/])|(?=[-+*/])"); 
        int operand1 = Integer.parseInt(delovi[0].trim());
        String operacija = delovi[1].trim();
        int operand2 = Integer.parseInt(delovi[2].trim());

        switch (operacija) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2; 
            default:
                throw new IllegalArgumentException("Nepoznata operacija: " + operacija);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Unesite string sa brojevima: ");
        String brojeviString = scanner.nextLine();
        
        
        int jednocifreniNegativniBrojevi = prebrojJednocifreneNegativneBrojeve(brojeviString);
        System.out.println("Broj jednocifrenih negativnih brojeva: " + jednocifreniNegativniBrojevi);

     
        System.out.print("Unesite aritmetički izraz (npr. '32+1'): ");
        String izraz = scanner.nextLine();

       
        int rezultat = izracunaj(izraz);
        System.out.println("Rezultat izraza '" + izraz + "' je: " + rezultat);
    }
}