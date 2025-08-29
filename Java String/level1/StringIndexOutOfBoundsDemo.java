import java.util.*;

class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); 
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length())); 
        } catch (StringIndexOutOfBoundsException e) {
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

// 6. IllegalArgumentException Demo
