import java.util.ArrayList;
public class NumberCheckerDigits {
    // Methods: count digits, store digits array, isDuck (has zero?), isArmstrong, largest/2nd largest, smallest/2nd smallest
    public static int countDigits(long n){
        if(n==0) return 1;
        n = Math.abs(n);
        int c=0; while(n>0){ c++; n/=10; } return c;
    }
    public static int[] digitsArray(long n){
        n = Math.abs(n);
        int c = countDigits(n);
        int[] d = new int[c];
        for(int i=c-1;i>=0;i--){ d[i] = (int)(n%10); n/=10; }
        return d;
    }
    public static boolean isDuck(int[] d){
        for(int x:d) if(x==0) return true; return false;
    }
    public static boolean isArmstrong(long n){
        int[] d = digitsArray(n);
        int p = d.length; long s=0;
        for(int x:d) s += Math.pow(x,p);
        return s == n;
    }
    public static int[] largestTwo(int[] d){
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for(int x:d){
            if(x>max1){ max2=max1; max1=x;}
            else if(x>max2) max2=x;
        }
        return new int[]{max1, max2};
    }
    public static int[] smallestTwo(int[] d){
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for(int x:d){
            if(x<s1){ s2=s1; s1=x; }
            else if(x<s2) s2=x;
        }
        return new int[]{s1, s2};
    }
    public static void main(String[] args){
        long n = 153; // sample
        System.out.println("Number: "+n);
        int[] d = digitsArray(n);
        System.out.print("Digits: ");
        for(int x:d) System.out.print(x+" ");
        System.out.println();
        System.out.println("Digit count: "+countDigits(n));
        System.out.println("Has zero (duck)?: "+isDuck(d));
        System.out.println("Is Armstrong?: "+isArmstrong(n));
        int[] lt = largestTwo(d);
        System.out.println("Largest: "+lt[0]+" Second Largest: "+lt[1]);
        int[] st = smallestTwo(d);
        System.out.println("Smallest: "+st[0]+" Second Smallest: "+st[1]);
    }
}
