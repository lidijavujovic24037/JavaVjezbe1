/*Dat je niz koji sadrži broj posjeta za poslednjih deset fudbalskih utakmica. Napisati 
program koji štampa koliko je bilo najviše posjeta u jednom danu.*/
import java.util.Scanner;

public class NajvisePosjeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] posjete = new int[10];

        System.out.println("Unesite broj posjeta za poslednjih deset fudbalskih utakmica:");
        for (int i = 0; i < posjete.length; i++) {
            posjete[i] = scanner.nextInt();
        }

        int maxPosjeta = nadjiMaxPosjeta(posjete);
        System.out.println("Najviše posjeta u jednom danu: " + maxPosjeta);
    }

    public static int nadjiMaxPosjeta(int[] posjete) {
        int max = posjete[0];
        for (int i = 1; i < posjete.length; i++) {
            if (posjete[i] > max) {
                max = posjete[i];
            }
        }
        return max;
    }
}
