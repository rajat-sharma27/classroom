import java.util.*;
public class AnagramCheck {
    public static boolean isAnagram(String a, String b) {
        if (a.length()!=b.length()) return false;
        int[] freq1=new int[256], freq2=new int[256];
        for (char c: a.toCharArray()) freq1[c]++;
        for (char c: b.toCharArray()) freq2[c]++;
        return Arrays.equals(freq1,freq2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String a=sc.nextLine();
        System.out.print("Enter second text: ");
        String b=sc.nextLine();
        System.out.println("Anagram? "+isAnagram(a,b));
    }
}