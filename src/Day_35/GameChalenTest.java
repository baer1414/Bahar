package Day_35;

import java.util.Scanner;

public class GameChalenTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("kaç hedefle karşılaştın");
        int hedef=sc.nextInt();
        System.out.println("kaçını vurdun");
        int isabet=sc.nextInt();
        Challenge challenge=new Challenge(hedef,isabet);

        System.out.println(challenge.getRank());
    }
}
