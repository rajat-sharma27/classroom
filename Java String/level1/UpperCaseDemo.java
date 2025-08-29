import java.util.*;

class UpperCaseDemo {
    public static String toUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
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
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String customUpper = toUpperCaseCustom(text);
        String builtinUpper = text.toUpperCase();
        System.out.println("Comparison Result: " + compareUsingCharAt(customUpper, builtinUpper));
    }
}

// 10. LowerCase Conversion
