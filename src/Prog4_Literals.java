// literals:

public class Prog4_Literals {
    public static void main(String[] args) {
        byte age = 34;
        char c = 'A';
        System.out.println("The age is: " + age + " and the char value is: " + c);

        //float marks = 3.66;   this is by default double so it gives errors so use:
        float marks = 3.66f;    // capital F or small f both works
        System.out.println("Marks: " + marks);

        double num = 3.55;  // this works!
        double num2 = 3.55d;  // this also works!   // capital D or small d both work

        int i1 = 45;
        short s1 = 98;
        // but:
        // long l1 = 9876543876543; // it considers the number to be integer. so:
        long l1 = 9876548765L;

        boolean a = true;


        // string:
        String str = "Omkar";
        System.out.println(str);
    }
}
