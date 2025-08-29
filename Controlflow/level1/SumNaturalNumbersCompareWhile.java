
import java.util.Scanner;

public class SumNaturalNumbersCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            System.out.println("Sum by formula: " + sumFormula);
            System.out.println("Sum by while loop: " + sumWhile);
            System.out.println("Both computations are " + (sumFormula == sumWhile ? "correct" : "different"));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
