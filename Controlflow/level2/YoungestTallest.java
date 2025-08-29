
import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();
        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = (minAge == ageAmar) ? "Amar" : (minAge == ageAkbar) ? "Akbar" : "Anthony";
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = (maxHeight == heightAmar) ? "Amar" : (maxHeight == heightAkbar) ? "Akbar" : "Anthony";
        System.out.println("Youngest friend is " + youngest + " aged " + minAge);
        System.out.println("Tallest friend is " + tallest + " with height " + maxHeight);
        sc.close();
    }
}
