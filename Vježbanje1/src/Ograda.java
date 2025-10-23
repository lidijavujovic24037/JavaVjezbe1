/*Fudbalski teren dimenzija d×s treba ograditi pravougaonom ogradom tako da je
rastojanje stranica ograde od linije terena r. Napisati program koji određuje dužinu
ograde.
Ulaz: U tri reda standardnog ulaza nalaze se tri cijela broja:
• d - dužina terena u metrima
• s - širina terena u metrima
• r - rastojanje ograde od terena u metrima
Izlaz: Duzina ograde u metrima*/
import java.util.Scanner;
public class Ograda {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int d = sc.nextInt(), s = sc.nextInt(), r = sc.nextInt();
int D = d + 2*r, S = s + 2*r;
int duzina = 2 * (D + S);
System.out.println(duzina);
}
}
	


