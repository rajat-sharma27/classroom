import java.util.*;

class SplitWordsDemo {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }
    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            } else word += ch;
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");
        System.out.println("Custom Split: " + Arrays.toString(custom));
        System.out.println("Built-in Split: " + Arrays.toString(builtin));
        System.out.println("Are both equal? " + compareArrays(custom, builtin));
    }
}