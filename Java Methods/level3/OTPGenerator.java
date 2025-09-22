import java.util.HashSet;
public class OTPGenerator {
    public static int generate6Digit(){
        return 100000 + (int)(Math.random()*900000);
    }
    public static boolean uniqueOTPs(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for(int x:arr) s.add(x);
        return s.size()==arr.length;
    }
    public static void main(String[] args){
        int[] otps = new int[10];
        for(int i=0;i<10;i++) otps[i]=generate6Digit();
        System.out.print("OTPs: ");
        for(int x:otps) System.out.print(x+" ");
        System.out.println();
        System.out.println("Unique? "+uniqueOTPs(otps));
    }
}
