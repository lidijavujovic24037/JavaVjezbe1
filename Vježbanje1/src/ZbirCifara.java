//Napisati program koji za zadati trocifreni broj računa zbir cifara tog broja.
import java.util.Scanner;
public class ZbirCifara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		n = Math.abs(n);
		int a = n/100, b = (n/10)%10, c = n%10;
		System.out.println(a+b+c);

	}}
