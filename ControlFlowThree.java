
import java.util.Scanner;

public class ControlFlowThree {


    // 1. LeapYear Program with multi and single if
    static void leapYear(Scanner sc) {
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else if (year % 4 != 0) {
            System.out.println(year + " is not a Leap Year.");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Using single if: " + year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println("Using single if: " + year + " is not a Leap Year.");
        }
    }


    // 2. Marks, Calculate percentage, grade, and remarks
    static void gradeCalculator(Scanner sc) {
        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        String grade = "";
        String remarks = "";

        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.println("Average Mark: " + average);
        System.out.println("Grade: " + grade + " (" + remarks + ")");
    }


    // 3. Prime Number Check
    static void primeNumberCheck(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }


    // 4. Armstrong Number Check
    static void armstrongNumber(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
    }


    // 5. Count digits in integer
    static void countDigits(Scanner sc) {
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
    }


    // 6. BMI Calculator with status
    static void bmiCalculator(Scanner sc) {
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        System.out.println("BMI is: " + bmi);
        System.out.println("Status: " + status);
    }


    // 7. Harshad Number Check
    static void harshadNumber(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;
        int num = number;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }


    // 8. Abundant Number Check
    static void abundantNumber(Scanner sc) {
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    }


    // 9. Calculator with switch case
    static void switchCalculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result = 0.0;
        boolean valid = true;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) result = first / second;
                else {
                    System.out.println("Division by zero not allowed!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                valid = false;
        }

        if (valid) System.out.println("Result = " + result);
    }


    // 10. DayOfWeek Calculation (using formula)
    static void dayOfWeek(Scanner sc) {
        System.out.print("Enter month (1-Jan, 2-Feb, ... 12-Dec): ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        String[] weekday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("DayOfWeek for " + m + "/" + d + "/" + y + " is " + weekday[d0] + " (" + d0 + ")");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Level 3 Practice Programs Menu ====");
            System.out.println("1. Leap Year");
            System.out.println("2. Grade Calculator");
            System.out.println("3. Prime Number");
            System.out.println("4. Armstrong Number");
            System.out.println("5. Count Digits");
            System.out.println("6. BMI Calculator");
            System.out.println("7. Harshad Number");
            System.out.println("8. Abundant Number");
            System.out.println("9. Calculator (switch-case)");
            System.out.println("10. Day of Week Calculator");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    leapYear(sc);
                    break;
                case 2:
                    gradeCalculator(sc);
                    break;
                case 3:
                    primeNumberCheck(sc);
                    break;
                case 4:
                    armstrongNumber(sc);
                    break;
                case 5:
                    countDigits(sc);
                    break;
                case 6:
                    bmiCalculator(sc);
                    break;
                case 7:
                    harshadNumber(sc);
                    break;
                case 8:
                    abundantNumber(sc);
                    break;
                case 9:
                    switchCalculator(sc);
                    break;
                case 10:
                    dayOfWeek(sc);
                    break;
                case 0:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }


}
