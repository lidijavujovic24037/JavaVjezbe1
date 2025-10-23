/*Napisati program kojim se proverava da li se može napraviti bašta u obliku trougla sa
datim dužinama stranica.*/
import java.util.Scanner;
public class Trougao {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Unesite dužinu prve stranice: ");
			int a = scanner.nextInt();
			System.out.print("Unesite dužinu druge stranice: ");
			int b = scanner.nextInt();
			System.out.print("Unesite dužinu treće stranice: ");
			int c = scanner.nextInt();
			if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Može se napraviti bašta.”);
			} else {
			System.out.println("Ne može se napraviti bašta.");
			}}}
