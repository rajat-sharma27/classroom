import java.util.*;

class VowelConsonantCount {
    public static boolean isVowel(char ch) {
        ch = (char)(ch >= 'A' && ch <= 'Z' ? ch + 32 : ch);
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
                if (isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v,c};
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int[] res = countVC(text);
        System.out.println("Vowels: " + res[0] + ", Consonants: " + res[1]);
    }
}