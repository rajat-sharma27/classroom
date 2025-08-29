import java.util.*;
public class DeckOfCards {
    public static String[] initDeck() {
        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck=new String[suits.length*ranks.length];
        int k=0;
        for (String r:ranks) for (String s:suits) deck[k++]=r+" of "+s;
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        for (int i=0;i<deck.length;i++) {
            int r=i+(int)(Math.random()*(deck.length-i));
            String temp=deck[i];
            deck[i]=deck[r];
            deck[r]=temp;
        }
    }
    public static void distribute(String[] deck,int players,int cards) {
        if (players*cards>deck.length) {
            System.out.println("Not enough cards!");
            return;
        }
        for (int i=0;i<players;i++) {
            System.out.print("Player "+(i+1)+": ");
            for (int j=0;j<cards;j++) {
                System.out.print(deck[i*cards+j]+", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String[] deck=initDeck();
        shuffleDeck(deck);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter players: ");
        int p=sc.nextInt();
        System.out.print("Enter cards per player: ");
        int c=sc.nextInt();
        distribute(deck,p,c);
    }
}