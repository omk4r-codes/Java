import java.util.Scanner;

public class Prog13_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You can drive");
        }
        else {
            System.out.println("Wait nigga");
        }

        System.out.print("Enter the marks:");
        int marks = sc.nextInt();
        if(marks > 100)
            System.out.println("You kiddin?");
        else if(marks > 90)
            System.out.println("Grade: A");
        else if(marks > 70)
            System.out.println("Grade: B");
        else if(marks > 50)
            System.out.println("Grade: C");
        else if(marks > 35)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: Fail");

    }
}
