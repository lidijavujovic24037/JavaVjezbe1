/*Napisati program kojim se učitava prirodan broj N i koji provjerava da li su cifre najmanje i najveće
težine toga broja jednake*/
import java.util.Scanner;
public class Cifre
{
public static void main(String[] args)
{
int N,cifNajm, cifNajv = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Unesi prirodan broj N: ");
N = sc.nextInt();
cifNajm = N % 10;
while(N != 0){
cifNajv = N%10;
N = N / 10;
}
if (cifNajm == cifNajv)
System.out.printf("Cifre %d i %d su iste.",cifNajv,cifNajm);
else
System.out.printf("Cifre %d i %d nisu iste.",cifNajv,cifNajm);
}}