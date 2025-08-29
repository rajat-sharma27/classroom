public class FizzBuzz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
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
        sc.close();
    }
}
