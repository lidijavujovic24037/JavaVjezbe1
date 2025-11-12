/*Ulaz je niz etiketa spojenih zarezima i tarabama, npr. 
"AI,urgent,#students,#aiClub,research,#hpc,UDG,#Students".  */
import java.util.*;

public class Hashtagovi {
    public static void main(String[] args) {
        String etikete = "AI,urgent,#students,#aiClub,research,#hpc,UDG,#Students";
        String rezultat = vratiJedinstveneHashtagove(etikete);
        System.out.println("Jedinstveni hashtagovi: " + rezultat);
    }

    public static String vratiJedinstveneHashtagove(String etikete) {
        Set<String> hashtagSet = new HashSet<>();
        String[] elementi = etikete.split("[,\\s]+");

        for (String element : elementi) {
            if (element.startsWith("#")) {
                hashtagSet.add(element.toLowerCase());
            }
        }

        List<String> sortedHashtags = new ArrayList<>(hashtagSet);
        Collections.sort(sortedHashtags);
        return String.join(",", sortedHashtags);
    }
}
