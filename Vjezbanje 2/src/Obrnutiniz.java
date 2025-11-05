

	public class Obrnutiniz { 
		public static void main(String[] args) { 
		int[] niz = new int[10]; 
		// Popuni niz brojevima od 1 do 10 
		for (int i = 0; i < niz.length; i++) { 
		niz[i] = i + 1; 
		} 
		// Ispis originalnog niza 
		System.out.println("Originalni niz:"); 
		for (int broj : niz) { //prolazi kroz niz 1 2 3 4 5 6 7 8 9 10 
		System.out.print(broj + " "); 
		} 
		// Ispis u obrnutom redosledu 
		System.out.println("\n\nNiz u obrnutom redosledu:"); 
		for (int i = niz.length - 1; i >= 0; i--) { 
		System.out.println(niz[i] + " "); }}}
		