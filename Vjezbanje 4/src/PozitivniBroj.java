//Napisati program koji provjerava koliko niz ima pozitivnih cijelih brojeva
public class PozitivniBroj {
	public static void main(String[] args) {
        int[] niz = {1, -2, 3, 4, -5, 6, 0};
        int brojPozitivnih = brojiPozitivneBrojeve(niz);
        System.out.println("Broj pozitivnih cijelih brojeva u nizu je: " + brojPozitivnih);
    }

    public static int brojiPozitivneBrojeve(int[] niz) {
        int brojPozitivnih = 0;
        for (int broj : niz) {
            if (broj > 0) {
                brojPozitivnih++;
            }
        }
        return brojPozitivnih;
    }
}

