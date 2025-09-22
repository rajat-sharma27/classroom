public class NumberCheckerPerfectAbundantDeficientStrong {
    public static int sumProperDivisors(int n){
        if(n<=1) return 0;
        int s=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                s+=i;
                int j = n/i;
                if(j!=i) s+=j;
            }
        }
        return s;
    }
    public static boolean isPerfect(int n){ return sumProperDivisors(n) == n; }
    public static boolean isAbundant(int n){ return sumProperDivisors(n) > n; }
    public static boolean isDeficient(int n){ return sumProperDivisors(n) < n; }
    public static long factorial(int n){ long f=1; for(int i=2;i<=n;i++) f*=i; return f; }
    public static boolean isStrong(int n){
        int t=n; long s=0;
        while(t>0){ s += factorial(t%10); t/=10; }
        return s == n;
    }
    public static void main(String[] args){
        int n=28;
        System.out.println("Perfect? "+isPerfect(n));
        System.out.println("Abundant? "+isAbundant(n));
        System.out.println("Deficient? "+isDeficient(n));
        int m=145; System.out.println("Strong? "+isStrong(m));
    }
}
