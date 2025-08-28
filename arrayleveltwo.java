import java.util.Scanner;

public class arrayleveltwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uncomment whichever program you want to test:
        // bonusEmployees(sc);
        // youngestTallest(sc);
        // largestSecondLargest(sc);
        // largestSecondLargestDynamic(sc);
        // reverseNumber(sc);
        // bmiCalculator(sc);
        // bmiCalculator2D(sc);
        // studentGrades(sc);
        // studentGrades2D(sc);
        // digitFrequency(sc);

        sc.close();
    }

    // 1. Bonus of 10 employees
    static void bonusEmployees(Scanner sc) {
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i+1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service: ");
            years[i] = sc.nextDouble();
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input, try again.");
                i--; continue;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) bonus[i] = salary[i] * 0.05;
            else bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }

    // 2. Youngest and Tallest among 3 friends
    static void youngestTallest(Scanner sc) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) minAgeIndex = i;
            if (heights[i] > heights[maxHeightIndex]) maxHeightIndex = i;
        }

        System.out.println("Youngest: " + names[minAgeIndex]);
        System.out.println("Tallest: " + names[maxHeightIndex]);
    }

    // 3. Largest and Second Largest (fixed size)
    static void largestSecondLargest(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;

        while (num != 0 && index < 10) {
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest + ", Second Largest = " + second);
    }

    // 4. Largest and Second Largest (dynamic size)
    static void largestSecondLargestDynamic(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (num != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }

        int largest = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest + ", Second Largest = " + second);
    }

    // 5. Reverse number
    static void reverseNumber(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        System.out.print("Reversed: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }

    // 6. BMI with arrays
    static void bmiCalculator(Scanner sc) {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height(m) for person " + (i+1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i]*height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) + " -> H: " + height[i] + " W: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        }
    }

    // 7. BMI with 2D array
    static void bmiCalculator2D(Scanner sc) {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height(m) for person " + (i+1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter weight(kg) for person " + (i+1) + ": ");
            personData[i][1] = sc.nextDouble();
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 24.9) status[i] = "Normal";
            else if (personData[i][2] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) + " -> H: " + personData[i][0] + " W: " + personData[i][1] + " BMI: " + personData[i][2] + " Status: " + status[i]);
        }
    }

    // 8. Student marks & grades (arrays)
    static void studentGrades(Scanner sc) {
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
    }

    // 9. Student marks & grades (2D array)
    static void studentGrades2D(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Maths marks: ");
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " -> %: " + percent[i] + " Grade: " + grade[i]);
        }
    }

    // 10. Frequency of digits
    static void digitFrequency(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] freq = new int[10];

        while (num != 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
        }
    }
}
