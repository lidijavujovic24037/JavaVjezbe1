import java.util.Scanner;
public class Taksivoznja {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Unesite broj predjenjih kilometara:");
	double kilometri= 1.0;
	double pocetnacijena=0.5;
	double cijenapokilometru=1.5;
	double UkupnaCijena=(pocetnacijena+kilometri*cijenapokilometru);
	System.out.println("Ukupna cijena voznje je + UkupnaCijena + eura.");
			sc.close();

	}

}
