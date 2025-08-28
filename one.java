import java.util.Scanner;

public class One {


    // 1. Harry Age
    static void harryAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }


    // 2. Sam PCM average
    static void samPCM() {
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }


    // 3. 10.8 km to miles
    static void kmToMilesFixed() {
        double km = 10.8;
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }


    // 4. Profit and Loss
    static void profitCalc() {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }


    // 5. Pens distribution
    static void pensDistribution() {
        int totalPens = 14, students = 3;
        int perStudent = totalPens / students;
        int remaining = totalPens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }


    // 6. Fixed Fee Discount
    static void universityFee() {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }


    // 7. Volume of Earth
    static void earthVolume() {
        double radiusKm = 6378;
        double pi = Math.PI;
        double volumeKm = (4.0/3) * pi * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0/3) * pi * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }


    // 8. Km to Miles user input
    static void kmToMilesInput(Scanner input) {
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }


    // 9. Fee Discount user input
    static void feeDiscountInput(Scanner sc) {
        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }


    // 10. Height Conversion
    static void heightConversion(Scanner sc) {
        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        int remainInches = (int)(inches % 12);
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainInches);
    }


    // 11. Calculator
    static void calculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
            + number1 + " and " + number2 + " is "
            + (number1 + number2) + ", "
            + (number1 - number2) + ", "
            + (number1 * number2) + ", "
            + (number1 / number2));
    }


    // 12. Triangle Area
    static void triangleArea(Scanner sc) {
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        double areaCm = area * 6.4516; // 1 in² = 6.4516 cm²
        System.out.println("The area of triangle is " + area + " square inches and " + areaCm + " square cm");
    }


    // 13. Square side
    static void squareSide(Scanner sc) {
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }


    // 14. Feet to yards & miles
    static void feetToYardsMiles(Scanner sc) {
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles for " + feet + " feet");
    }


    // 15. Total Purchase Price
    static void purchasePrice(Scanner sc) {
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }


    // 16. Max Handshakes
    static void maxHandshakes(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== All In One Java Programs ===");
            System.out.println("1. Harry's Age");
            System.out.println("2. Sam’s Average PCM");
            System.out.println("3. Convert 10.8 km to miles");
            System.out.println("4. Profit & Profit Percentage");
            System.out.println("5. Pens Distribution");
            System.out.println("6. University Fee (Fixed Discount)");
            System.out.println("7. Volume of Earth");
            System.out.println("8. Km to Miles (User Input)");
            System.out.println("9. Fee Discount (User Input)");
            System.out.println("10. Height Conversion (cm → feet/inches)");
            System.out.println("11. Basic Calculator");
            System.out.println("12. Area of Triangle");
            System.out.println("13. Side of Square");
            System.out.println("14. Feet to Yards & Miles");
            System.out.println("15. Purchase Price");
            System.out.println("16. Max Handshakes");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1: harryAge(); break;
                case 2: samPCM(); break;
                case 3: kmToMilesFixed(); break;
                case 4: profitCalc(); break;
                case 5: pensDistribution(); break;
                case 6: universityFee(); break;
                case 7: earthVolume(); break;
                case 8: kmToMilesInput(sc); break;
                case 9: feeDiscountInput(sc); break;
                case 10: heightConversion(sc); break;
                case 11: calculator(sc); break;
                case 12: triangleArea(sc); break;
                case 13: squareSide(sc); break;
                case 14: feetToYardsMiles(sc); break;
                case 15: purchasePrice(sc); break;
                case 16: maxHandshakes(sc); break;
                case 0: System.out.println("Exiting program..."); break;
                default: System.out.println("Invalid choice! Try again");
            }

        } while(choice != 0);

        sc.close();
    }


}
