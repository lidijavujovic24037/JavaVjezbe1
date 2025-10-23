/*Zamislite da pravite program koji treba da odluči da li student može da pristupi ispitu.
Postoje dva uslova: student mora imati više od 75% prisustva na predavanjima i mora
imati predate sve seminarske radove. Oba uslova moraju biti zadovoljena da bi student
mogao pristupiti ispitu. Algoritam treba da štampa odgovarajuću poruku. Dodatak:
prisustvo se unosi u procentima, a dio za seminarske radove na sledeci nacin -> 0
predstavlja da bar jedan seminarski rad nike uradjen, a 1 da su svi seminarski radovi
uradjeni*/
import java.util.Scanner;
public class Ispit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite procenat prisustva: ");
		int prisustvo = scanner.nextInt();
		System.out.print("Unesite status seminarskih radova:");
		int seminarski = scanner.nextInt();
		if (prisustvo > 75 && seminarski == 1) {
		System.out.println("Student može pristupiti ispitu.");
		} else {
		System.out.println("Student ne može pristupiti ispitu.");

}}}
