import java.util.*;

class StringLengthDemo {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        int customLen = getLength(text);
        int builtinLen = text.length();
        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtinLen);
    }
}