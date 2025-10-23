import java.util.Scanner;

public class Zid {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double x1=sc.nextDouble();
	double x2=sc.nextDouble();
	double y1=sc.nextDouble();
	double y2=sc.nextDouble();
	double a=Math.abs(x1-x2);
	double b=Math.abs(y2-y1);
	double P=a*b;
	double O=2*a+2*b;
	System.out.printf("%.2f%n, O");
	

	}

}
