import java.util.*;

class ShortestLongestWord {
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
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (getLength(w) < getLength(shortest)) shortest = w;
            if (getLength(w) > getLength(longest)) longest = w;
        }
        System.out.println("Shortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }
}