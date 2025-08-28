import java.util.Scanner;

public class ControlFlowOne {


    // 1. Check if a number is divisible by 5
    static void divisibleBy5(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        boolean divisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);
    }


    // 2. Check if first is the smallest of 3 numbers
    static void firstIsSmallest(Scanner sc) {
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        boolean isSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }


    // 3. Check largest among three numbers
    static void largestOfThree(Scanner sc) {
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
    }


    // 4. Check for natural number and sum of n natural numbers
    static void sumNaturalNumbers(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number >= 1) {
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }


    // 5. Check if a person can vote (age >= 18)
    static void canVote(Scanner sc) {
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }


    // 6. Check if number is positive, negative, or zero
    static void posNegZero(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }


    // 7. SpringSeason program: check if date is in spring season
    static void springSeason(Scanner sc) {
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Spring is March 20 (3/20) to June 20 (6/20)
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
    }


    // 8. Rocket countdown using while loop
    static void countdownWhile(Scanner sc) {
        System.out.print("Enter starting number for countdown: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }


    // 9. Rocket countdown using for loop
    static void countdownFor(Scanner sc) {
        System.out.print("Enter starting number for countdown: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }


    // 10. Sum of numbers until user enters 0 (while loop)
    static void sumUntilZero(Scanner sc) {
        double total = 0.0;
        double input;
        do {
            System.out.print("Enter a number (0 to stop): ");
            input = sc.nextDouble();
            if (input != 0) total += input;
        } while (input != 0);

        System.out.println("The total sum is " + total);
    }


    // 11. Sum of numbers until user enters 0 or negative (using infinite while and break)
    static void sumUntilZeroOrNegative(Scanner sc) {
        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }
            total += input;
        }

        System.out.println("The total sum is " + total);
    }


    // 12. Sum of n natural numbers using while loop and formula, then compare
    static void sumNaturalNumbersCompareWhile(Scanner sc) {
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            System.out.println("Sum by formula: " + sumFormula);
            System.out.println("Sum by while loop: " + sumWhile);
            System.out.println("Both computations are " + (sumFormula == sumWhile ? "correct" : "different"));
        } else {
            System.out.println("Not a natural number");
        }
    }


    // 13. Sum of n natural numbers using for loop and formula, then compare
    static void sumNaturalNumbersCompareFor(Scanner sc) {
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
    }


    // 14. Factorial using while loop
    static void factorialWhile(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a positive integer");
            return;
        }

        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }


    // 15. Factorial using for loop
    static void factorialFor(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a positive integer");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is " + factorial);
    }


    // 16. Print odd and even numbers from 1 to n
    static void oddEvenPrint(Scanner sc) {
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }


    // 17. Employee bonus based on years of service > 5 years (5% bonus)
    static void employeeBonus(Scanner sc) {
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus applicable");
        }
    }


    // 18. Multiplication table of a number from 6 to 9
    static void multiplicationTable(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }


    // Main method with menu for all programs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========= Level 1 Practice Programs Menu =========");
            System.out.println("1. Check if divisible by 5");
            System.out.println("2. First is smallest of 3 numbers");
            System.out.println("3. Largest of 3 numbers");
            System.out.println("4. Sum of n natural numbers");
            System.out.println("5. Check voting eligibility");
            System.out.println("6. Check positive/negative/zero");
            System.out.println("7. Check Spring season");
            System.out.println("8. Count down using while loop");
            System.out.println("9. Count down using for loop");
            System.out.println("10. Sum until zero (while loop)");
            System.out.println("11. Sum until zero or negative (infinite while + break)");
            System.out.println("12. Sum natural numbers (while loop vs formula)");
            System.out.println("13. Sum natural numbers (for loop vs formula)");
            System.out.println("14. Factorial using while loop");
            System.out.println("15. Factorial using for loop");
            System.out.println("16. Print odd and even numbers");
            System.out.println("17. Employee bonus based on years of service");
            System.out.println("18. Multiplication table from 6 to 9");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1: divisibleBy5(sc); break;
                case 2: firstIsSmallest(sc); break;
                case 3: largestOfThree(sc); break;
                case 4: sumNaturalNumbers(sc); break;
                case 5: canVote(sc); break;
                case 6: posNegZero(sc); break;
                case 7: springSeason(sc); break;
                case 8: countdownWhile(sc); break;
                case 9: countdownFor(sc); break;
                case 10: sumUntilZero(sc); break;
                case 11: sumUntilZeroOrNegative(sc); break;
                case 12: sumNaturalNumbersCompareWhile(sc); break;
                case 13: sumNaturalNumbersCompareFor(sc); break;
                case 14: factorialWhile(sc); break;
                case 15: factorialFor(sc); break;
                case 16: oddEvenPrint(sc); break;
                case 17: employeeBonus(sc); break;
                case 18: multiplicationTable(sc); break;
                case 0: System.out.println("Exiting program...Bye!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }


}
