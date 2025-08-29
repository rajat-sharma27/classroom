import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;
        int num = number;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
        sc.close();
    }
}