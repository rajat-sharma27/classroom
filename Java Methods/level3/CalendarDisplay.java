import java.util.Scanner;
public class CalendarDisplay {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static boolean isLeap(int y){ return (y%4==0 && y%100!=0) || (y%400==0); }
    public static int daysInMonth(int m,int y){
        if(m==2) return mdays[1] + (isLeap(y)?1:0);
        return mdays[m-1];
    }
    // Zeller or Gregorian: we'll compute day of week (0=Sun) for 1st day
    public static int firstDayOfMonth(int m,int y){
        int d = 1;
        // Using Tomohiko Sakamoto algorithm for day of week
        int[] t = {0,3,2,5,0,3,5,1,4,6,2,4};
        int Y = y;
        if(m<3) Y -= 1;
        int dow = (Y + Y/4 - Y/100 + Y/400 + t[m-1] + d) % 7; // 0=Sunday
        return dow;
    }
    public static void display(int m,int y){
        System.out.println("   "+months[m-1]+" "+y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int first = firstDayOfMonth(m,y);
        int days = daysInMonth(m,y);
        for(int i=0;i<first;i++) System.out.print("   ");
        for(int d=1; d<=days; d++){
            System.out.printf("%2d ", d);
            if((first + d) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        // Example: July 2005
        display(7,2005);
    }
}
