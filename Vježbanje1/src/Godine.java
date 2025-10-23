/*. Napisati program koji računa koje godine je rođen Miloš ukoliko je poznato da danas
ima N godina.*/
import java.util.Scanner;
import java.time.*;
public class Godine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // godine starosti
		int year = LocalDate.now().getYear();
		System.out.println(year - N);
		}
		}

