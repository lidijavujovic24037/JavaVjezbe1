/*Napisati program koji za unijete nizove a i b vraća niz zajedničkih elementa 
niza a i niza b. Elementi niza a i niza b su brojevi.  
Input 1: a = {1,2, 3}, b = {3, 2} Output 1: {2, 3} 
Input 2: a = {2, 3, 4}, b = {1, 1, 7} Output 2: {}*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ZajednickiElementi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj elemenata niza a: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Unesite elemente niza a:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Unesite broj elemenata niza b: ");
        int m = scanner.nextInt();
        int[] b = new int[m];

        System.out.println("Unesite elemente niza b:");
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int[] zajednickiElementi = pronadjiZajednickeElemente(a, b);

        
        System.out.print("Zajednički elementi su: {");
        for (int i = 0; i < zajednickiElementi.length; i++) {
            System.out.print(zajednickiElementi[i]);
            if (i < zajednickiElementi.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] pronadjiZajednickeElemente(int[] a, int[] b) {
        HashSet<Integer> setA = new HashSet<>();
        ArrayList<Integer> zajednickiList = new ArrayList<>();

        for (int broj : a) {
            setA.add(broj);
        }

       
        for (int broj : b) {
            if (setA.contains(broj) && !zajednickiList.contains(broj)) {
                zajednickiList.add(broj); // Dodajemo zajednički element
            }
        }

        
        int[] zajednickiElementi = new int[zajednickiList.size()];
        for (int i = 0; i < zajednickiList.size(); i++) {
            zajednickiElementi[i] = zajednickiList.get(i);
        }

        return zajednickiElementi;
    }
}