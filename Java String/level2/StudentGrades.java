import java.util.*;

class StudentGrades {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i=0;i<n;i++) {
            scores[i][0] = rand.nextInt(41)+60; // Physics
            scores[i][1] = rand.nextInt(41)+60; // Chemistry
            scores[i][2] = rand.nextInt(41)+60; // Math
        }
        return scores;
    }
    public static String grade(double percent) {
        if (percent>=90) return "A+";
        if (percent>=80) return "A";
        if (percent>=70) return "B";
        if (percent>=60) return "C";
        if (percent>=50) return "D";
        return "F";
    }
    public static void run() {
        int[][] scores = generateScores(5);
        System.out.println("Phy	Chem	Math	Total	Avg	Percent	Grade");
        for (int[] s : scores) {
            int total = s[0]+s[1]+s[2];
            double avg = total/3.0;
            double percent = (total/300.0)*100;
            System.out.printf("%d	%d	%d	%d	%.2f	%.2f	%s
",
                s[0],s[1],s[2],total,avg,percent,grade(percent));
        }
    }
}