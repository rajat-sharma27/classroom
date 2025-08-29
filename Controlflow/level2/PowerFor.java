
import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        if (power < 0) {
            System.out.println("Power must be non-negative");
            sc.close();
            return;
        }
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + "^" + power + " = " + result);
        sc.close();
    }
}
