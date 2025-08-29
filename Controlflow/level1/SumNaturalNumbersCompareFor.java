
import java.util.Scanner;

public class SumNaturalNumbersCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            System.out.println("Sum by formula: " + sumFormula);
            System.out.println("Sum by for loop: " + sumFor);
            System.out.println("Both computations are " + (sumFormula == sumFor ? "correct" : "different"));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
