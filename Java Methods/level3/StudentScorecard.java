import java.util.Random;
public class StudentScorecard {
    public static int[][] generateScores(int students){
        Random r = new Random();
        int[][] scores = new int[students][3];
        for(int i=0;i<students;i++){
            scores[i][0] = 10 + r.nextInt(90); // Physics 10..99
            scores[i][1] = 10 + r.nextInt(90); // Chemistry
            scores[i][2] = 10 + r.nextInt(90); // Maths
        }
        return scores;
    }
    public static double[][] totalsAvgPercent(int[][] s){
        int n = s.length; double[][] out = new double[n][3];
        for(int i=0;i<n;i++){
            int tot = s[i][0]+s[i][1]+s[i][2];
            double avg = (double)tot/3.0;
            double perc = (double)tot/300.0*100.0;
            out[i][0]=tot; out[i][1]=Math.round(avg*100.0)/100.0; out[i][2]=Math.round(perc*100.0)/100.0;
        }
        return out;
    }
    public static void display(int[][] scores, double[][] stats){
        System.out.println("P\tC\tM\tTotal\tAvg\tPercent");
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+
                (int)stats[i][0]+"\t"+String.format("%.2f",stats[i][1])+"\t"+String.format("%.2f",stats[i][2]));
        }
    }
    public static void main(String[] args){
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] stats = totalsAvgPercent(scores);
        display(scores, stats);
    }
}
