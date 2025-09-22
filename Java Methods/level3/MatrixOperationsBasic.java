import java.util.Random;
public class MatrixOperationsBasic {
    public static int[][] randomMatrix(int r,int c){
        Random rnd = new Random();
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=rnd.nextInt(10);
        return m;
    }
    public static int[][] add(int[][] a,int[][] b){
        int r=a.length, c=a[0].length; int[][] out=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) out[i][j]=a[i][j]+b[i][j];
        return out;
    }
    public static int[][] subtract(int[][] a,int[][] b){
        int r=a.length, c=a[0].length; int[][] out=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) out[i][j]=a[i][j]-b[i][j];
        return out;
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int r=a.length, c=b[0].length, common=a[0].length;
        int[][] out=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++){
            int s=0;
            for(int k=0;k<common;k++) s+=a[i][k]*b[k][j];
            out[i][j]=s;
        }
        return out;
    }
    public static void display(int[][] m){
        for(int i=0;i<m.length;i++){ for(int j=0;j<m[0].length;j++) System.out.print(m[i][j]+" "); System.out.println(); }
    }
    public static void main(String[] args){
        int[][] A = randomMatrix(2,2);
        int[][] B = randomMatrix(2,2);
        System.out.println("A:"); display(A);
        System.out.println("B:"); display(B);
        System.out.println("A+B:"); display(add(A,B));
        System.out.println("A-B:"); display(subtract(A,B));
        System.out.println("A*B:"); display(multiply(A,B));
    }
}
