/*Napisati program koji za unešeni cijeli broj x računa vrijednost funkcije f(x) prema sledećem pravilu:
f(x) = x2
, za x<1; f(x) = 2-x, za 1≤ x<5 i f(x) = (x3
-1)/5, za x≥5.*/
import java.util.Scanner;
public class Funkcija {

	public static void main(String[] args) {
int x;
float f=0;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
if(x<1) f=x*x;
else
	if(x>=1 && x<5)
		f=2-x;
	else if(x>=5)
		f=(float)(x*x*x-1)/5;
System.out.printf("f(%d)=%.2f",x,f);


	}

}
