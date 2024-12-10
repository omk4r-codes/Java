// detect whether the no. is int or not
import  java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        System.out.println(sc.hasNextInt());
    }
}
