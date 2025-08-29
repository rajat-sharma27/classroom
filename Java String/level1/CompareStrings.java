import java.util.*;

class CompareStrings {
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean customCompare = compareUsingCharAt(s1, s2);
        boolean equalsMethod = s1.equals(s2);

        System.out.println("Custom Compare Result: " + customCompare);
        System.out.println("Equals Method Result: " + equalsMethod);
    }
}

// 2. Substring using charAt()
