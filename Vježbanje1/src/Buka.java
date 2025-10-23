/*Kućni red zabranjuje pravljenje buke prije 6 časova, između 13 i 17 časova i nakon 22
časa. Napiši program koji radnicima govori da li u nekom datom trenutku mogu da
izvode bučnije radove.*/
import java.util.Scanner;
public class Buka {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite sat (0-23): ");
		int sat = scanner.nextInt();
		if (sat < 6 || (sat >= 13 && sat < 17) || sat >= 22) {
		System.out.println("Radnici ne smiju praviti buku.");
		} else {
		System.out.println("Radnici mogu izvoditi bučne radove.");

}}}
