/*Napisati program koji od korisnika traži da unese jedan cijeli broj. Program treba da
odredi: da li je broj paran ili neparan, da li je broj pozitivan ili negativan (nulu tretirati kao
pozitivan broj). Na kraju se štampa odgovarajuća poruka u formatu: "Broj je
pozitivan/paran", "Broj je negativan/neparan", u zavisnosti od rezultata provjere.*/
import java.util.Scanner;
public class ParanNeparan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		int broj = sc.nextInt();
		if (broj >= 0) {
		if (broj % 2 == 0) {
		System.out.println("Broj je pozitivan i paran.");
		} else {
		System.out.println("Broj je pozitivan i neparan.");
		}
		} else {
		if (broj % 2 == 0) {
		System.out.println("Broj je negativan i paran.");
		} else {
		System.out.println("Broj je negativan i neparan.");

}}}}
