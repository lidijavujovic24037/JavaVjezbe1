//Unijeti rečenicu koja sadrži više riječi odvojenih prazninama i odrediti broj riječi. 
import java.util.Scanner;
public class PrazninaString {
	 public static void main(String[] args) { 
		 Scanner sc=new Scanner(System.in);
		 String line=sc.nextLine();
		 line = line.trim(); //uklanja praznine 
		 String[] parts = line.split("\\s+"); //razbije jedan veliki string na više manjih delova i vrati ih kao niz (String[]
	        System.out.println(parts.length); //“bilo koji razmak” (space, tab, novi red, itd) +jedan ili vise
	    } 
	
		 
	 }


