import java.util.*;

class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i=0;i<n;i++) ages[i] = rand.nextInt(90)+10;
        return ages;
    }
    public static String[][] checkVoting(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i=0;i<ages.length;i++) {
            table[i][0] = String.valueOf(ages[i]);
            table[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return table;
    }
    public static void run() {
        int[] ages = generateAges(10);
        String[][] table = checkVoting(ages);
        System.out.println("Age	Eligibility");
        for (String[] row : table) {
            System.out.println(row[0] + "	" + row[1]);
        }
    }
}