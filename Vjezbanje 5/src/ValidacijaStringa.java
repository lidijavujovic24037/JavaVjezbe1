/*Dat je string je tipa: "{host=udg.me;port=443;secure=true;paths=/ai,/dl,/cv}". 
Validiraj format (parovi ključ=vrijednost odvojeni ;, lista paths odvojena 
zarezima, svi ključevI prisutni). Ako je string validan, vrati "OK", u suprotnom 
vratiti odgovarajuću grešku.*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ValidacijaStringa {
    public static void main(String[] args) {
        String input = "{host=udg.me;port=443;secure=true;paths=/ai,/dl,/cv}";
        String rezultat = validirajFormat(input);
        System.out.println(rezultat);
    }

    public static String validirajFormat(String input) {
        if (!input.startsWith("{") || !input.endsWith("}")) {
            return "Greška: Neispravan format";
        }

        String[] parovi = input.substring(1, input.length() - 1).split(";");
        Set<String> kljucevi = new LinkedHashSet<>(Arrays.asList("host", "port", "secure", "paths"));
        for (String par : parovi) {
            String[] delovi = par.split("=");
            if (delovi.length != 2 || !kljucevi.contains(delovi[0])) {
                return "Greška: Neispravan par ključ=vrednost";
            }
        }

        return "OK";
    }
}