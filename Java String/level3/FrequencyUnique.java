import java.util.*;
public class FrequencyUnique {
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] result = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) if (text.charAt(j) == c) { unique = false; break; }
            if (unique) result[k++] = c;
        }
        return Arrays.copyOf(result, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = uniqueCharacters(text);
        int[] freq = new int[unique.length];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            for (int j = 0; j < unique.length; j++) if (unique[j] == c) freq[j]++;
        }
        for (int i = 0; i < unique.length; i++) {
            System.out.println(unique[i] + " -> " + freq[i]);
        }
    }
}