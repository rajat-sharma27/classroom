import java.util.Scanner;
public class PositiveEvenCompare {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }
        for (int n : nums) {
            if (isPositive(n)) {
                System.out.print(n + " is Positive and ");
                if (isEven(n)) System.out.println("Even");
                else System.out.println("Odd");
            } else System.out.println(n + " is Negative");
        }
        int cmp = compare(nums[0], nums[4]);
        if (cmp == 0) System.out.println("First and Last are Equal");
        else if (cmp == 1) System.out.println("First is Greater");
        else System.out.println("First is Smaller");
        sc.close();
    }
}
