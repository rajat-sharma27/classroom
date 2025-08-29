public class NumberCheck {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
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
        sc.close();
    }
}
