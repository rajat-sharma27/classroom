import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        sc.close();
    }
}