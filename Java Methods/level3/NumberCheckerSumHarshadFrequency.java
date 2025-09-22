import java.util.Arrays;
public class NumberCheckerSumHarshadFrequency {
    public static int[] digitsArray(long n){
        n = Math.abs(n);
        if(n==0) return new int[]{0};
        int len = (int)Math.floor(Math.log10(n))+1;
        int[] d = new int[len];
        for(int i=len-1;i>=0;i--){ d[i] = (int)(n%10); n/=10; }
        return d;
    }
    public static int sumDigits(int[] d){ int s=0; for(int x:d) s+=x; return s; }
    public static int sumSquares(int[] d){ int s=0; for(int x:d) s+= x*x; return s; }
    public static boolean isHarshad(long n){
        int[] d = digitsArray(n); int s = sumDigits(d); if(s==0) return false; return n % s == 0;
    }
    public static int[][] frequency(long n){
        int[] d = digitsArray(n);
        int[][] res = new int[10][2];
        for(int i=0;i<10;i++){ res[i][0]=i; res[i][1]=0; }
        for(int x:d) res[x][1]++;
        return res;
    }
    public static void main(String[] args){
        long n = 21;
        int[] d = digitsArray(n);
        System.out.println("Number: "+n);
        System.out.println("Digits: "+Arrays.toString(d));
        System.out.println("Sum of digits: "+sumDigits(d));
        System.out.println("Sum of squares: "+sumSquares(d));
        System.out.println("Is Harshad?: "+isHarshad(n));
        int[][] freq = frequency(n);
        System.out.println("Digit frequencies (digit : freq):");
        for(int i=0;i<10;i++) System.out.println(freq[i][0]+" : "+freq[i][1]);
    }
}
