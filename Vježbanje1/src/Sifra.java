import java.util.Scanner;
public class Sifra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Unesite neki trocifreni broj:");
		int broj=sc.nextInt();
		int c1=broj/100;
		int c2=(broj%100)/10;
		int c3=broj%10;
		int zbircifara=c1+c2+c3;
		int proizvod=c1*c2*c3;
		int Sifra=proizvod-zbircifara;
		
		
				

	}

}
