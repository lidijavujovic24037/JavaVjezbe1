/*U selu poznatom po svojim jabukama, održava se godišnje takmičenje u berbi jabuka
između i najbliži pobjedi su Petar i Miloš. Petar tvrdi da je ubrao p jabuka, dok Miloš tvrdi
da je ubrao m jabuka. Vaš zadatak je da kreirate program koji će provjeriti da li je Petar
uspio da ubere više jabuka nego Miloš i shodno tome ispiše poruku o pobjedniku.
Pretpostaviti da ne mogu ubrati isti broj jabuka.*/

import java.util.Scanner;

public class Pobjednik {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Petar je ubrao: ");
		int p = scanner.nextInt();
		System.out.print("Miloš je ubrao: ");
		int m = scanner.nextInt();
		if (p > m) {
		System.out.println("Pobjednik je Petar!");
		} else {
		System.out.println("Pobjednik je Miloš!");
		}
		}
		}

