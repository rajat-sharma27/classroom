import java.util.Scanner;

public class ControlFlowTwo {


    // 1. Print odd and even numbers between 1 to number
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


    // 2. Find bonus of employees based on years of service
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


    // 3. Multiplication table of number from 6 to 9
    static void multiplicationTable(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }


    // 4. FizzBuzz using for loop
    static void fizzBuzzFor(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }


    // 5. FizzBuzz using while loop
    static void fizzBuzzWhile(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        int i = 1;
        while (i <= n) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }


    // 6. Find youngest and tallest friend among 3 based on age and height
    static void youngestTallest(Scanner sc) {
        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int ageAmar = sc.nextInt();
        int ageAkbar = sc.nextInt();
        int ageAnthony = sc.nextInt();

        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        double heightAmar = sc.nextDouble();
        double heightAkbar = sc.nextDouble();
        double heightAnthony = sc.nextDouble();

        // Youngest
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = (minAge == ageAmar) ? "Amar" : (minAge == ageAkbar) ? "Akbar" : "Anthony";

        // Tallest
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = (maxHeight == heightAmar) ? "Amar" : (maxHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("Youngest friend is " + youngest + " aged " + minAge);
        System.out.println("Tallest friend is " + tallest + " with height " + maxHeight);
    }


    // 7. Factors of a number (for loop)
    static void factorsFor(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }


    // 8. Factors of a number (while loop)
    static void factorsWhile(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }


    // 9. Greatest factor of number (for loop)
    static void greatestFactorFor(Scanner sc) {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        for (int i = number -1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor of " + number + " beside itself is " + greatestFactor);
    }


    // 10. Greatest factor of number (while loop)
    static void greatestFactorWhile(Scanner sc) {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        int counter = number - 1;
        while (counter > 0) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " beside itself is " + greatestFactor);
    }


    // 11. Multiples of a number below 100 (for loop backwards)
    static void multiplesBelow100For(Scanner sc) {
        System.out.print("Enter positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }


    // 12. Power of a number (for loop)
    static void powerFor(Scanner sc) {
        System.out.print("Enter number: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power must be non-negative");
            return;
        }

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(base + "^" + power + " = " + result);
    }


    // 13. Multiples of number below 100 (while loop)
    static void multiplesBelow100While(Scanner sc) {
        System.out.print("Enter positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Multiples of " + number + " below 100:");
        int counter = 100;
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }


    // 14. Power of number (while loop)
    static void powerWhile(Scanner sc) {
        System.out.print("Enter number: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power must be non-negative");
            return;
        }

        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= base;
            counter++;
        }

        System.out.println(base + "^" + power + " = " + result);
    }


    // Main menu to run all programs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Level 2 Practice Programs Menu =====");
            System.out.println("1. Print odd and even numbers");
            System.out.println("2. Employee bonus based on years of service");
            System.out.println("3. Multiplication table from 6 to 9");
            System.out.println("4. FizzBuzz (for loop)");
            System.out.println("5. FizzBuzz (while loop)");
            System.out.println("6. Find youngest and tallest friend");
            System.out.println("7. Factors of number (for loop)");
            System.out.println("8. Factors of number (while loop)");
            System.out.println("9. Greatest factor using for loop");
            System.out.println("10. Greatest factor using while loop");
            System.out.println("11. Multiples below 100 (for loop)");
            System.out.println("12. Power of a number (for loop)");
            System.out.println("13. Multiples below 100 (while loop)");
            System.out.println("14. Power of a number (while loop)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1: oddEvenPrint(sc); break;
                case 2: employeeBonus(sc); break;
                case 3: multiplicationTable(sc); break;
                case 4: fizzBuzzFor(sc); break;
                case 5: fizzBuzzWhile(sc); break;
                case 6: youngestTallest(sc); break;
                case 7: factorsFor(sc); break;
                case 8: factorsWhile(sc); break;
                case 9: greatestFactorFor(sc); break;
                case 10: greatestFactorWhile(sc); break;
                case 11: multiplesBelow100For(sc); break;
                case 12: powerFor(sc); break;
                case 13: multiplesBelow100While(sc); break;
                case 14: powerWhile(sc); break;
                case 0: System.out.println("Exiting program. Goodbye!"); break;
                default: System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }


}
