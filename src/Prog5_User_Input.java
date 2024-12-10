import java.util.Scanner;

public class Prog5_User_Input {
    public static void main(String[] args) {
        System.out.println("Taking user input -->");
        // for that we need to make an object of the Scanner class to read input from keyboard:
        Scanner sc = new Scanner(System.in);
        // now we are ready to take input from user:

        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        int sum  = n1 + n2;
        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + sum);

        sc.nextLine(); // Consume the remaining newline after nextInt()

        // can we input a char?
        // char ch = sc.nextChar();
        // nothing like this!
        // it works like this:
        System.out.println("Enter line maybe: ");
        char ch = sc.next().charAt(0);
        System.out.println("Char ch = " + ch);

        sc.nextLine();

        // for string:
        System.out.println("Enter string :");
        String str1 = sc.nextLine();
        System.out.println("The str is : " + str1);

    }
}


// why it doesn't take string input?
/*
The issue arises due to how the Scanner class handles input. Specifically, after using methods like nextInt() or nextDouble(),
a newline character (\n) remains in the input buffer. This affects subsequent calls to nextLine(), as it reads the
leftover newline character instead of waiting for new input.
Breakdown of the Problem:
When you enter an integer (e.g., n1 and n2) using sc.nextInt(), it reads the number but leaves the newline (\n) in the buffer.
When sc.nextLine() is called right after, it consumes this leftover newline instead of waiting for new input, resulting in an
empty string being assigned to str1.
soln: Consume the remaining newline after nextInt() by adding an extra:
sc.nextLine();
 */