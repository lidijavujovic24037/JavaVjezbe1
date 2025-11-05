//Napisati program koji za unijeti prirodan broj N računa njegovu absolutnu vrijednost
import java.util.Scanner;
public class AbsBroj{
public static void main(String[] args){
int N, pom;
Scanner u = new Scanner(System.in);
System.out.print("Unesi N: ");
N = u.nextInt();
pom = N;
if (N<0) N=-N;
System.out.printf("|%d| = %d",pom,N);
}
}
