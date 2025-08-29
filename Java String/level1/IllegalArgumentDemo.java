import java.util.*;

class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled Exception: " + e);
        }
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        // generateException(text); // Uncomment to see crash
        handleException(text);
    }
}

// 7. NumberFormatException Demo
