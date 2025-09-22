public class MatrixOperationsAdvanced {
    public static double[][] transpose(double[][] a){
        int r=a.length, c=a[0].length; double[][] t = new double[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }
    public static double det2(double[][] m){
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }
    public static double det3(double[][] m){
        double d = m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                 - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                 + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        return d;
    }
    public static double[][] inverse2(double[][] m){
        double d = det2(m);
        if(Math.abs(d) < 1e-9) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/d; inv[0][1] = -m[0][1]/d;
        inv[1][0] = -m[1][0]/d; inv[1][1] = m[0][0]/d;
        return inv;
    }
    public static double[][] inverse3(double[][] m){
        double d = det3(m);
        if(Math.abs(d) < 1e-9) return null;
        double[][] adj = new double[3][3];
        // compute cofactors transposed (adjugate)
        adj[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1]);
        adj[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0]);
        adj[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0]);
        adj[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1]);
        adj[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0]);
        adj[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0]);
        adj[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1]);
        adj[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0]);
        adj[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0]);
        double[][] inv = new double[3][3];
        for(int i=0;i<3;i++) for(int j=0;j<3;j++) inv[i][j] = adj[i][j]/d;
        return inv;
    }
    public static void display(double[][] m){
        for(int i=0;i<m.length;i++){ for(int j=0;j<m[0].length;j++) System.out.printf("%.4f ", m[i][j]); System.out.println(); }
    }
    public static void main(String[] args){
        double[][] A = {{4,7},{2,6}};
        System.out.println("A:"); display(A);
        System.out.println("Det2: "+det2(A));
        double[][] inv2 = inverse2(A);
        System.out.println("Inv2:"); if(inv2!=null) display(inv2); else System.out.println("Not invertible");
        double[][] B = {{1,2,3},{0,1,4},{5,6,0}};
        System.out.println("B:"); display(B);
        System.out.println("Det3: "+det3(B));
        double[][] inv3 = inverse3(B);
        System.out.println("Inv3:"); if(inv3!=null) display(inv3); else System.out.println("Not invertible");
    }
}
