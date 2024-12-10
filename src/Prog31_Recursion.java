public class Prog31_Recursion {
    static int factorial(int n){
        if(n==1 || n == 0)
            return 1;
        return n * factorial(n-1);
    }

    static int fact_iterative(int n){
        int res = 1;
        for (int i = 1; i <= n; i++){
            res = res * i;
        }
        return res;
    }

    // 0 1 1 2 3 5 8 13 21 ...
    /*
    F(0) = 0
    F(1) = 1
    F(n) = F(n-1) + F(n-2) for n > 1
    */
    static int fibonacci(int n){
        if(n==0)    return 0;
        if(n==1)    return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + factorial(5));
        System.out.println("Factorial of 5 is " + fact_iterative(5));
        System.out.println(fibonacci(7));
    }
}
