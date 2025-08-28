import java.util.Scanner;

public class arraylevelone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Call any method from here to test
        // Example: ageVoting(sc);
        // Uncomment whichever you want to run

        // ageVoting(sc);
        // numberCheck(sc);
        // multiplicationTable(sc);
        // storeNumbers(sc);
        // multiplicationFrom6to9(sc);
        // meanHeight(sc);
        // oddEvenArrays(sc);
        // factorsOfNumber(sc);
        // copy2DArray(sc);
        // fizzBuzz(sc);

        sc.close();
    }

    // 1. Voting based on age
    static void ageVoting(Scanner sc) {
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }

    // 2. Positive, negative, zero + even/odd + compare first/last
    static void numberCheck(Scanner sc) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (num > 0) {
                System.out.print(num + " is positive and ");
                if (num % 2 == 0) System.out.println("even.");
                else System.out.println("odd.");
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        if (arr[0] == arr[arr.length - 1])
            System.out.println("First and last elements are equal.");
        else if (arr[0] > arr[arr.length - 1])
            System.out.println("First element is greater.");
        else
            System.out.println("Last element is greater.");
    }

    // 3. Multiplication table
    static void multiplicationTable(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }

    // 4. Store numbers until 0, negative, or max 10
    static void storeNumbers(Scanner sc) {
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            arr[index++] = num;
        }
        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.println("Number[" + i + "] = " + arr[i]);
        }
        System.out.println("Sum = " + total);
    }

    // 5. Multiplication table for numbers 6 to 9
    static void multiplicationFrom6to9(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] results = new int[4];
        for (int i = 6; i <= 9; i++) {
            results[i - 6] = num * i;
            System.out.println(num + " * " + i + " = " + results[i - 6]);
        }
    }

    // 6. Mean height of football team
    static void meanHeight(Scanner sc) {
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean height = " + mean);
    }

    // 7. Save odd and even numbers
    static void oddEvenArrays(Scanner sc) {
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Not a natural number!");
            return;
        }
        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];
        int oi = 0, ei = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) even[ei++] = i;
            else odd[oi++] = i;
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");
        System.out.println();
    }

    // 8. Factors of a number
    static void factorsOfNumber(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == factors.length) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }

    // 9. Copy 2D array into 1D
    static void copy2DArray(Scanner sc) {
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] array = new int[rows * cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[idx++] = matrix[i][j];
            }
        }
        System.out.print("1D Array: ");
        for (int val : array) System.out.print(val + " ");
        System.out.println();
    }

    // 10. FizzBuzz
    static void fizzBuzz(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }
        String[] results = new String[num + 1];
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) results[i] = "FizzBuzz";
            else if (i % 3 == 0) results[i] = "Fizz";
            else if (i % 5 == 0) results[i] = "Buzz";
            else results[i] = String.valueOf(i);
        }
        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
