public class EmployeeBonus {
    public static double[][] generateEmployees(int n){
        double[][] a = new double[n][2];
        for(int i=0;i<n;i++){
            int salary = 10000 + (int)(Math.random()*90000); // 5-digit approx
            int years = (int)(Math.random()*15); // 0..14
            a[i][0]=salary; a[i][1]=years;
        }
        return a;
    }
    public static double[][] computeNewSalaryAndBonus(double[][] arr){
        int n = arr.length;
        double[][] out = new double[n][3]; // old, bonus, new
        for(int i=0;i<n;i++){
            double old = arr[i][0]; int yrs = (int)arr[i][1];
            double perc = (yrs>5)?0.05:0.02;
            double bonus = old * perc;
            double neu = old + bonus;
            out[i][0]=old; out[i][1]=bonus; out[i][2]=neu;
        }
        return out;
    }
    public static void summary(double[][] out){
        double sumOld=0,sumNew=0,sumBonus=0;
        for(int i=0;i<out.length;i++){ sumOld+=out[i][0]; sumBonus+=out[i][1]; sumNew+=out[i][2]; }
        System.out.println(String.format("%-10s %-12s %-12s","SumOld","SumBonus","SumNew"));
        System.out.println(String.format("%-10.2f %-12.2f %-12.2f", sumOld,sumBonus,sumNew));
    }
    public static void main(String[] args){
        double[][] emp = generateEmployees(10);
        double[][] out = computeNewSalaryAndBonus(emp);
        System.out.println("Old\tYears\tBonus\tNew");
        for(int i=0;i<10;i++) System.out.println((int)emp[i][0]+"\t"+(int)emp[i][1]+"\t"+String.format("%.2f",out[i][1])+"\t"+String.format("%.2f",out[i][2]));
        summary(out);
    }
}
