import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int count = 0;
        int num = Math.abs(number);
        if (num == 0) count = 1;
        else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}