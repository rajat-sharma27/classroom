import java.util.*;
public class FrequencyNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] chars = text.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') continue;
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';
                }
            }
            System.out.println(chars[i] + " -> " + count);
        }
    }
}