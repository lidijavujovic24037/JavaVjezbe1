import java.util.Scanner;
public class PovrsinaPapira {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double sirinaMm = sc.nextDouble(), visinaMm = sc.nextDouble();
	double Pcm2 = (sirinaMm * visinaMm) / 100.0; // 1 cm² = 100 mm²
	System.out.printf("%.2f%n", Pcm2);
	}}
