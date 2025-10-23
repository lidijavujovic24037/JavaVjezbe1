/*Na takmičenju iz matematike učestvovalo je N učenika. Izveštaj o broju poena
odštampan je na dvije strane. Nastavnik greškom nije ponio prvu stranu izveštaja, ali se
sjeća da je na dnu strane pisalo da je prosječan broj poena za tu stranu bio p1. Na
drugoj strani (koju ima kod sebe) su podaci o K učenika i prosječan broj poena za tu
stranu je p2. Napisati program kojim se određuje koliki je prosječan broj poena svih
učenika.
Ulaz: Na standardnom ulazu nalaze se
• u prvoj liniji prirodan broj N ukupna broj učenika
• u drugoj liniji prirodan broj K broj učenika na drugoj strani
• u trećoj liniji realan broj p1 prosječan broj poena učenika na prvoj strani
• u četvrtoj liniji realan broj p2 prosječan broj poena učenika na drugoj strani
Izlaz: Na standarnom izlazu prikazati, na dvije decimale, prosječan broj bodova svih
učenika.
Primjer
Ulaz: 80, 30, 78.20, 89.30
Izlaz: 82.36*/
import java.util.Scanner;
public class Poeni {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ukupan broj učenika
		int K = sc.nextInt(); // broj na drugoj strani
		double p1 = sc.nextDouble(), p2 = sc.nextDouble();
		int n1 = N - K;
		double ukupno = p1 * n1 + p2 * K;
		double prosjek = ukupno / N;
		System.out.printf("%.2f%n", prosjek);

}}
