/*U tajanstvenom svijetu postoji portal koji se otvara samo kada mu se date paran broj.
Kao mladi čarobnjak na svom prvom zadatku, dobio si čarobni štapić koji može
generisati brojeve. Vaš zadatak je da kreirate program koji će provjeriti da li je broj koji je
čarobni štapić generisao paran. Ako jeste, algoritam treba da ispiše: "Portal se otvara!"
Ako nije, algoritam treba da ispiše: "Portal ostaje zatvoren."*/

import java.util.Scanner;
public class CarobniStapic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Čarobni štapić je generisao broj: ");
		int broj = scanner.nextInt();
		if (broj % 2 == 0) {
		System.out.println("Portal se otvara!");
		} else {
		System.out.println("Portal ostaje zatvoren.");}}}


