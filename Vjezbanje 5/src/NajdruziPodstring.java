import java.util.HashSet;
import java.util.Set;

public class NajdruziPodstring {
    public static void main(String[] args) {
        String input = "ABcdeF-12aB 99XYz";
        pronadjiNajduziPodstring(input);
    }

    public static void pronadjiNajduziPodstring(String input) {
        String longestSubstring = "";
        int startIndex = 0;
        
        for (int i = 0; i < input.length(); i++) {
            Set<Character> seen = new HashSet<>();
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < input.length(); j++) {
                char c = input.charAt(j);
                if (Character.isLetterOrDigit(c) && !seen.contains(Character.toLowerCase(c))) {
                    seen.add(Character.toLowerCase(c));
                    currentSubstring.append(c);
                } else {
                    break;
                }
            }
            if (currentSubstring.length() > longestSubstring.length()) {
                longestSubstring = currentSubstring.toString();
                startIndex = i;
            }
        }

        System.out.printf("Najduži podstring: \"%s\", dužina: %d, indeks: %d%n", longestSubstring, longestSubstring.length(), startIndex);
    }
}