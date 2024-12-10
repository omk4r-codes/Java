import java.util.Scanner;

public class Prog15_Exercise {
    public static void main(String[] args) {
        //Write a program t find out whether a Student
        //is pass or fail: it requires min 40%%
        //and I at least 33% in each subject to pass
        //Assume 3 Subjects and take marks as an input
        //from the user.
        Scanner sc = new Scanner(System.in);
        float s1, s2, s3;
        System.out.print("Enter marks of s1, s2, s3: ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        System.out.printf("%f, %f, %f\n", s1, s2, s3);
        if(s1 <= 33 || s2 <= 33 || s3 <= 33)
            System.out.println("You fail");
        else {
            float percentage = (s1 + s2 + s3) * 100 / 300;
            System.out.printf("Percentage: %.2f\n", percentage);
            if (percentage < 40)
                System.out.println("You still fail");
            else
                System.out.println("You pass");
        }
    }
}
