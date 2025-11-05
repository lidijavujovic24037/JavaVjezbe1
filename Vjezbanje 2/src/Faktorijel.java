//Napisati program kojim se računa faktorijel broj N.

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {
int N;
long P=1;
Scanner sc=new Scanner(System.in);
System.out.print("Unesite neki prirodan broj N:");
N=sc.nextInt();
for(int i=1; i<=N;i++)
	P=P*i;
System.out.printf("%d!=%d",N,P);

	}

}
