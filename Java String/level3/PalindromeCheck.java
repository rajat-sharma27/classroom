import java.util.*;
public class PalindromeCheck {
    public static boolean isPalindrome1(String text) {
        int i=0, j=text.length()-1;
        while (i < j) {
            if (text.charAt(i)!=text.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start)!=text.charAt(end)) return false;
        return isPalindrome2(text, start+1, end-1);
    }
    public static boolean isPalindrome3(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i=0; i<arr.length; i++) rev[i]=arr[arr.length-1-i];
        return Arrays.equals(arr,rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        System.out.println("Logic1: "+isPalindrome1(t));
        System.out.println("Logic2: "+isPalindrome2(t,0,t.length()-1));
        System.out.println("Logic3: "+isPalindrome3(t));
    }
}