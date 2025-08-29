public class StoreNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
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
        sc.close();
    }
}
