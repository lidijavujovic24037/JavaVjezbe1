import java.util.Scanner;
public class KvadratTrinoma {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
double rez = a*a + b*b + c*c + 2*a*b + 2*a*c + 2*b*c;
System.out.printf("%.2f%n", rez);

}}
