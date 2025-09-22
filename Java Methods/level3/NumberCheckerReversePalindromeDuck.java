import java.util.Arrays;
public class NumberCheckerReversePalindromeDuck {
    public static int[] digitsArray(long n){
        n = Math.abs(n);
        if(n==0) return new int[]{0};
        int len = (int)Math.floor(Math.log10(n))+1;
        int[] d = new int[len];
        for(int i=len-1;i>=0;i--){ d[i] = (int)(n%10); n/=10; }
        return d;
    }
    public static int[] reverseArray(int[] a){
        int[] r = new int[a.length];
        for(int i=0;i<a.length;i++) r[i]=a[a.length-1-i];
        return r;
    }
    public static boolean arraysEqual(int[] a, int[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(long n){
        int[] a = digitsArray(n);
        int[] r = reverseArray(a);
        return arraysEqual(a,r);
    }
    public static boolean isDuck(long n){
        int[] a = digitsArray(n);
        for(int x:a) if(x==0) return true;
        return false;
    }
    public static void main(String[] args){
        long n = 121;
        System.out.println("Number: "+n);
        System.out.println("Reverse digits equal?: "+isPalindrome(n));
        System.out.println("Is Duck?: "+isDuck(n));
    }
}
