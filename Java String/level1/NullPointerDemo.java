import java.util.*;

class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    public static void run() {
        // generateException(); // Uncomment to see crash
        handleException();
    }
}

// 5. StringIndexOutOfBoundsException Demo
