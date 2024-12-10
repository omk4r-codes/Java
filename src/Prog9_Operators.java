public class Prog9_Operators {
    public static void main(String[] args) {
        int a = 8;
        int b = 2 * a;
        System.out.println(b);

        System.out.println(4.8 % 1.1);  // it works

        int c = 7;
        c = c + a;
        System.out.println(c);
        // also do like
        c += a;
        System.out.println(c);

        System.out.println(a++);    // post-increment
        System.out.println(++b);    // pre-increment

        System.out.println(6 == 9);
        System.out.println(7 != 8);
        System.out.println(6 == 9 && 7 != 8);
        System.out.println(6 == 9 || 7 != 8);


        System.out.println(6 ^ 5);

        a = b = c = 98;     // this works in java!
        System.out.println(a + " , " + b + " , "+ c);
    }
}
