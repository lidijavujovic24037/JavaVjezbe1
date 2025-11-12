/* Za zadatu listu brojeva štampati onaj broj koji daje najveći zbir cifara. Radi 
jednostavnosti, pretpostaviti da nema brojeva koji daju isti zbir cifara. */
import java.util.Scanner;

public class NajveciZbirCifara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza: ");
        int n = scanner.nextInt();
        int[] niz = new int[n];

        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++) {
            niz[i] = scanner.nextInt();
        }

        int brojSaNajveciZbirCifara = pronadjiBrojSaNajveciZbirCifara(niz);
        
        
        System.out.println("Broj sa najvećim zbirom cifara je: " + brojSaNajveciZbirCifara);
    }

    public static int pronadjiBrojSaNajveciZbirCifara(int[] niz) {
        int maxZbirCifara = 0;
        int brojSaMaxZbirom = niz[0]; 

        for (int broj : niz) {
            int zbirCifara = zbirCifara(broj);
            if (zbirCifara > maxZbirCifara) {
                maxZbirCifara = zbirCifara;
                brojSaMaxZbirom = broj;
            }
        }

        return brojSaMaxZbirom;
    }

    public static int zbirCifara(int broj) {
        int zbir = 0;
        while (broj != 0) {
            zbir += broj % 10; 
            broj /= 10; 
        }
        return zbir;
    }
}
