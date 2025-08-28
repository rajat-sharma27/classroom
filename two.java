import java.util.Scanner;

public class Two {


    // 1. Basic Calculator (Addition, Subtraction, Multiplication, Division)
    static void basicCalculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " +
            multiplication + ", and " + division);
    }


    // 2. Area of Triangle (square inches and square centimeters)
    static void triangleArea(Scanner sc) {
        System.out.print("Enter base in centimeters: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is " + areaCm);
    }


    // 3. Side of Square from Perimeter
    static void squareSide(Scanner sc) {
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }


    // 4. Distance in yards and miles from feet
    static void feetToYardsMiles(Scanner sc) {
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }


    // 5. Total Purchase Price
    static void totalPurchasePrice(Scanner sc) {
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
            " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }


    // 6. Quotient and Remainder of two numbers
    static void quotientRemainder(Scanner sc) {
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
            " of two number " + number1 + " and " + number2);
    }


    // 7. Integer Operations (IntOperation)
    static void intOperation(Scanner sc) {
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();

        System.out.print("Enter integer b: ");
        int b = sc.nextInt();

        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
    }


    // 8. Double Operations (DoubleOpt)
    static void doubleOpt(Scanner sc) {
        System.out.print("Enter double value a: ");
        double a = sc.nextDouble();

        System.out.print("Enter double value b: ");
        double b = sc.nextDouble();

        System.out.print("Enter double value c: ");
        double c = sc.nextDouble();

        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;

        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
    }


    // Main menu for user choice
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Level 2 Practice Programs Menu =====");
            System.out.println("1. Basic Calculator (Add, Sub, Mul, Div)");
            System.out.println("2. Triangle Area in sq in and sq cm");
            System.out.println("3. Side of Square from Perimeter");
            System.out.println("4. Distance in Yards and Miles (from Feet)");
            System.out.println("5. Total Purchase Price");
            System.out.println("6. Quotient and Remainder");
            System.out.println("7. Integer Operations (IntOperation)");
            System.out.println("8. Double Operations (DoubleOpt)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1: basicCalculator(sc); break;
                case 2: triangleArea(sc); break;
                case 3: squareSide(sc); break;
                case 4: feetToYardsMiles(sc); break;
                case 5: totalPurchasePrice(sc); break;
                case 6: quotientRemainder(sc); break;
                case 7: intOperation(sc); break;
                case 8: doubleOpt(sc); break;
                case 0: System.out.println("Exiting the program. Goodbye!"); break;
                default: System.out.println("Invalid choice! Please try again.");
            }

        } while(choice != 0);

        sc.close();
    }

}
