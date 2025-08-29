import java.util.*;

class VowelConsonantType {
    public static String charType(char ch) {
        if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
            ch = (char)(ch >= 'A' && ch <= 'Z' ? ch + 32 : ch);
            return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] analyze(String text) {
        String[][] arr = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            arr[i][0] = String.valueOf(text.charAt(i));
            arr[i][1] = charType(text.charAt(i));
        }
        return arr;
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] res = analyze(text);
        System.out.println("Char	Type");
        for (String[] row : res) {
            System.out.println(row[0] + "	" + row[1]);
        }
    }
}