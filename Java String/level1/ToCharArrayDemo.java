import java.util.*;

class ToCharArrayDemo {
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        char[] customArr = customToCharArray(text);
        char[] builtinArr = text.toCharArray();

        System.out.println("Comparison Result: " + compareCharArrays(customArr, builtinArr));
    }
}

// 4. NullPointerException Demo
