import java.util.Random;
import java.util.Scanner;

class GuessingGame{
    private int id;
    private String uname;
    private Random rand = new Random();
    int num = rand.nextInt(100);


    public GuessingGame(int id, String uname){
        this.id = id;
        this.uname = uname;
    }

    public int getNum(){
        return num;
    }
    public void play(){
        Scanner sc = new Scanner(System.in);
        int no_of_iterations = 0;
        while (true){
            no_of_iterations++;
            System.out.print("Guess the number: ");
            int n = sc.nextInt();
            if (n == num){
                System.out.printf("You win in %d rounds!!!\n", no_of_iterations);
                break;
            }
            else if(n > num){
                System.out.println("Guess smaller number...");
                continue;
            }
            else{
                System.out.println("Guess bigger number...");
                continue;
            }
        }
    }

}

public class Prog38_GuessingGame {
    public static void main(String[] args) {
        GuessingGame ash = new GuessingGame(10, "ashwatthama");
//        System.out.println(ash.getNum());
        ash.play();
    }
}
