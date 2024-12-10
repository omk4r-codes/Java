import java.util.Scanner;
import java.util.Random;

public class Prog16_stone_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your move (r for rock, p for paper, s for scissors):");
        char move = sc.nextLine().charAt(0);
        if(move != 'r' && move != 'p' && move != 's'){
            System.out.println("you suck");
        }
//        else System.out.println("Valid move");

        int comp_move = rand.nextInt(3);
        // 0 = r
        // 1 = p
        // 2 = s
        System.out.println("Comp selected: " + comp_move);
        if (move == 'r') {
            if (comp_move == 0)
                System.out.println("Tied");
            if (comp_move == 1)
                System.out.println("You lose!");
            if (comp_move == 2)
                System.out.println("You win!");
        }
        else if (move == 'p') {
            if (comp_move == 0)
                System.out.println("You win!");
            if (comp_move == 1)
                System.out.println("Tied");
            if (comp_move == 2)
                System.out.println("You lose!");
        }
        else if (move == 's') {
            if (comp_move == 0)
                System.out.println("You lose!");
            if (comp_move == 1)
                System.out.println("You win!");
            if (comp_move == 2)
                System.out.println("Tied");
        }

    }
}
