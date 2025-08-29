import java.util.*;
public class CalendarDisplay {
    public static boolean isLeap(int year) {
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
    public static int daysInMonth(int m, int y) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if (m==2 && isLeap(y)) return 29;
        return days[m-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m=sc.nextInt();
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("   " + months[m-1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int d=1;
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+31*m0/12)%7;
        for (int i=0;i<d0;i++) System.out.print("    ");
        int days=daysInMonth(m,y);
        for (int i=1;i<=days;i++) {
            System.out.printf("%3d ",i);
            if (((i+d0)%7==0)) System.out.println();
        }
        System.out.println();
    }
}