import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] phy = new double[n];
        double[] chem = new double[n];
        double[] math = new double[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            phy[i] = sc.nextDouble();
            System.out.print("Enter Chemistry marks: ");
            chem[i] = sc.nextDouble();
            System.out.print("Enter Maths marks: ");
            math[i] = sc.nextDouble();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " -> %: " + percent[i] + " Grade: " + grade[i]);
        }
        sc.close();
    }
}