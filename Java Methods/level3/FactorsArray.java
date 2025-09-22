import java.util.ArrayList;
public class FactorsArray {
    public static int[] factors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) if(n%i==0) list.add(i);
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++) arr[i]=list.get(i);
        return arr;
    }
    public static int greatestFactor(int[] arr){
        if(arr.length==0) return -1; int g=arr[0]; for(int v:arr) if(v>g) g=v; return g;
    }
    public static int sumFactors(int[] arr){ int s=0; for(int v:arr) s+=v; return s; }
    public static long productFactors(int[] arr){ long p=1; for(int v:arr) p*=v; return p; }
    public static double productCubeFactors(int[] arr){
        double p=1; for(int v:arr) p*=Math.pow(v,3); return p;
    }
    public static void main(String[] args){
        int n=28;
        int[] f = factors(n);
        System.out.print("Factors: ");
        for(int v:f) System.out.print(v+" ");
        System.out.println();
        System.out.println("Greatest: "+greatestFactor(f));
        System.out.println("Sum: "+sumFactors(f));
        System.out.println("Product: "+productFactors(f));
        System.out.println("Product of cubes: "+productCubeFactors(f));
    }
}
