import java.util.*;

class SubstringCompare {
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSub = substringUsingCharAt(text, start, end);
        String builtinSub = text.substring(start, end);

        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtinSub);
        System.out.println("Comparison Result: " + compareUsingCharAt(customSub, builtinSub));
    }
}

// 3. Convert string to char array
