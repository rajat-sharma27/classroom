import java.util.*;

class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
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

// 8. ArrayIndexOutOfBoundsException Demo
