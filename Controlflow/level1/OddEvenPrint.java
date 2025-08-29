
import java.util.Scanner;

public class OddEvenPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            sc.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        sc.close();
    }
}
