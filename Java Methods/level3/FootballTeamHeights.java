public class FootballTeamHeights {
    // Generate 11 heights (150-250 cm, 3-digit) and compute sum, mean, min, max
    public static int[] generateHeights(int n) {
        int[] h = new int[n];
        for (int i=0;i<n;i++) {
            h[i] = 150 + (int)(Math.random()*101); // 150..250 inclusive
        }
        return h;
    }
    public static int sum(int[] arr){
        int s=0; for(int v:arr) s+=v; return s;
    }
    public static double mean(int[] arr){ return (double)sum(arr)/arr.length; }
    public static int min(int[] arr){ int m=arr[0]; for(int v:arr) if(v<m) m=v; return m; }
    public static int max(int[] arr){ int M=arr[0]; for(int v:arr) if(v>M) M=v; return M; }
    public static void main(String[] args){
        int[] heights = generateHeights(11);
        System.out.print("Heights (cm): ");
        for(int h:heights) System.out.print(h+" ");
        System.out.println();
        System.out.println("Sum = " + sum(heights));
        System.out.printf("Mean = %.2f%n", mean(heights));
        System.out.println("Shortest = " + min(heights));
        System.out.println("Tallest  = " + max(heights));
    }
}
