/*Na kružnoj stazi nalazi se N polja označenih brojevima od 0 do N−1. Igrač kreće sa 
polja broj 0. Zatim se unosi T poteza. Svaki potez je broj K koji označava koliko mjesta 
igrač ide unaprijed u smjeru kazaljke na satu. Nakon svakog poteza igrač staje na 
novo polje, a polje na kome se zaustavio treba ispisati. Na kraju se ispisuje i konačna 
pozicija igrača. Primjer: Ako je N=8, a potezi su 3, 4, 7 igrač ide: sa 0 na 3, zatim sa 3 
na 7, pa na (7+7) % 8=6 Konačna pozicija je 6 (u svakom koraku se računa 
(trenutna_poz + K) % N)*/
import java.util.Scanner;
public class Staza {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long T=sc.nextLong();
		long polje=0;
		for(int i=0; i<T;i++) {
			 long K = sc.nextLong();
			 polje = (polje + K) % N;  // kružno kretanje 
	            System.out.println(polje); // ispiši novo polje 
	        } 
	        // Konačna pozicija: 
	        System.out.println(polje); 
	    } 
	

		

	}


