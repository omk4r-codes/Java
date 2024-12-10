//take input of 5 marks by students and convert it to %ge
import java.util.Scanner;

public class Prog6_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of sub1: ");
        float s1 = sc.nextByte();
        System.out.print("Enter marks of sub2: ");
        float s2 = sc.nextByte();
        System.out.print("Enter marks of sub3: ");
        float s3 = sc.nextByte();
        System.out.print("Enter marks of sub4: ");
        float s4 = sc.nextByte();
        System.out.print("Enter marks of sub5: ");
        float s5 = sc.nextByte();

        float percentage = (s1 + s2 + s3 + s4 + s5) / 5;
        System.out.println("Your percentage is: " + percentage);
    }
}
