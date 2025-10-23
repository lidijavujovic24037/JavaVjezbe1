/*Cijena konzole za igre PlayStation 5 je prvo porasla 10%, pa je smanjena 10%. Ako je
poznata početna cijena konzole, napisati program koji određuje cijenu nakon tih
promjena.*/
import java.util.Scanner;
public class PlayStation {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double pocetna = sc.nextDouble();
double poslePovecanja = pocetna * 1.10;
double konacna = poslePovecanja * 0.90;
System.out.printf("%.2f%n", konacna);
}
}



