public class Prog21_Exercise {
    public static void main(String[] args) {
        /*
                q1: loop:
                 * * * *
                 * * *
                 * *
                 *
         */
        for (int i = 0; i < 4; i++){
            for (int j = 4 - i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // q2: sum of 1st n even nos
        int n = 4;
        int sum = 0;
        for (int i = 2; i <= 2*n; i+=2){
            sum = sum + i;
        }
        System.out.println(sum);

        // q3: factorial of n
        n = 5;
        int fact = 1;
        for (int i = 1; i <= 5; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
