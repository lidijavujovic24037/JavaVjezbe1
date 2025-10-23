/*Takmičari su radili testove iz matematike i programiranja. Za svaki predmet dobili su
određeni broj poena (cio broj od 0 do 50). Takmičari se rangiraju po ukupnom broju
poena iz oba predmeta. Ako dva takmičara imaju isti broj poena, pobjednik je onaj koji
ima više poena iz programiranja. Potrebno je napisati program koji određuje pobjednika
takmičenja*/
import java.util.Scanner;
public class Bodovi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite poene iz matematike za prvog
		takmičara: ");
		int m1 = scanner.nextInt();
		System.out.print("Unesite poene iz programiranja za prvog
		takmičara: ");
		int p1 = scanner.nextInt();
		System.out.print("Unesite poene iz matematike za drugog
		takmičara: ");
		int m2 = scanner.nextInt();
		System.out.print("Unesite poene iz programiranja za drugog
		takmičara: ");
		int p2 = scanner.nextInt();
		int ukupno1 = m1 + p1;
		int ukupno2 = m2 + p2;
		if (ukupno1 > ukupno2 || (ukupno1 == ukupno2 && p1 > p2)) {
		System.out.println("Pobjednik je prvi takmičar!");
		} else {
		System.out.println("Pobjednik je drugi takmičar!");
		}}}


