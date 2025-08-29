import java.util.*;

class WordLengthTable {
    public static int getLength(String text) {
        int count = 0;
        try { while (true) { text.charAt(count); count++; } }
        catch (Exception e) { return count; }
    }
    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) { words.add(word); word = ""; }
            } else word += ch;
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }
    public static String[][] wordWithLength(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordWithLength(words);
        System.out.println("Word	Length");
        for (String[] row : table) {
            System.out.println(row[0] + "	" + Integer.parseInt(row[1]));
        }
    }
}