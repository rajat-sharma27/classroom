
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        boolean isSpring = false;
        if (month == 3 && day >= 20) {
            isSpring = true;
        } else if (month > 3 && month < 6) {
            isSpring = true;
        } else if (month == 6 && day <= 20) {
            isSpring = true;
        }
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
}
