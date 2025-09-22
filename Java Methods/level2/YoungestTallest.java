import java.util.Scanner;
public class YoungestTallest {
    public static int findYoungest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[idx]) idx = i;
        }
        return idx;
    }
    public static int findTallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[idx]) idx = i;
        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        System.out.println("Youngest is: " + names[findYoungest(ages)]);
        System.out.println("Tallest is: " + names[findTallest(heights)]);
        sc.close();
    }
}
