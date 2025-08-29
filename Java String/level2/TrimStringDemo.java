import java.util.*;

class TrimStringDemo {
    public static String customTrim(String text) {
        int start = 0, end = text.length()-1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        String result = "";
        for (int i = start; i <= end; i++) result += text.charAt(i);
        return result;
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();
        String custom = customTrim(text);
        String builtin = text.trim();
        System.out.println("Custom: [" + custom + "]");
        System.out.println("Built-in: [" + builtin + "]");
        System.out.println("Equal? " + custom.equals(builtin));
    }
}