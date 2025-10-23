/*Knjižara "Bukvarnica" je posebno mjesto gdje svaka knjiga ima svoju priču. Kako bi
proslavili dolazak novog godišnjeg doba, knjižara je odlučila da uvede popust - svaka
knjiga dobija popust koji se može otkriti samo uz pomoć programa. Kao pomoćnik u
knjižari, vaš zadatak je da napišete program koji će izračunati konačnu cijenu knjige
nakon primijenjenog popusta*/
import java.util.Scanner;
public class Bukvarnica {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cijena = sc.nextDouble(); // npr. 24.99
		double popustProcenat = sc.nextDouble(); // npr. 15 za 15%
		double konacno = cijena * (1 - popustProcenat / 100.0);
		System.out.printf("%.2f%n", konacno);
		}
		}


