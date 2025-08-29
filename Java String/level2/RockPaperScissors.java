import java.util.*;

class RockPaperScissors {
    public static String computerChoice() {
        String[] choices = {"rock","paper","scissors"};
        return choices[(int)(Math.random()*3)];
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock")))
            return "User";
        return "Computer";
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        int userWin=0, compWin=0, draw=0;
        for (int i=0;i<n;i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user,comp);
            if (winner.equals("User")) userWin++;
            else if (winner.equals("Computer")) compWin++;
            else draw++;
            System.out.println("Game " + (i+1) + ": User=" + user + " Comp=" + comp + " Winner=" + winner);
        }
        System.out.println("Final Stats: User=" + userWin + " Computer=" + compWin + " Draws=" + draw);
    }
}