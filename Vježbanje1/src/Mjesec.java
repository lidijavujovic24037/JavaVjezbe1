import java.util.Scanner;
public class Mjesec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Unesite broj mjeseca:");
		int brojMjeseca=sc.nextInt();
		String nazivMjeseca="";
		switch(brojMjeseca) {
		case 1:
        nazivMjeseca="Januar";
				break;
		case 2:
		nazivMjeseca="Februar";
				break;
		case 3:
			  nazivMjeseca = "Mart";
			  break;
			case 4:
			  nazivMjeseca = "April";
			  break;
			case 5:
			  nazivMjeseca = "Maj";
			  break;
			case 6:
			  nazivMjeseca = "Jun";
			  break;
			case 7:
			  nazivMjeseca = "Jul";
			  break;
			case 8:
			  nazivMjeseca = "Avgust";
			  break;
			case 9:
			  nazivMjeseca = "Septembar";
			  break;
			case 10:
			  nazivMjeseca = "Oktobar";
			  break;
			case 11:
			  nazivMjeseca = "Novembar";
			  break;
			case 12:
			  nazivMjeseca = "Decembar";
			  break;
		}
		
		

	}

}
