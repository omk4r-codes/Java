public class Prog32_Exercises {
    //1:
    static void pattern(int n){
        for (int i = 0; i<n;i++){
            for (int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //2:
    static int sumofnnatural(int n){
        if( n==1)
            return 1;
        return n + sumofnnatural(n-1);
    }

    //3
    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for (int j = n-i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //using recursion:
    static void patternRecur(int n){
        if(n>0){
            patternRecur(n-1);
            for (int i = 0; i < n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternRecur2(int n){
        if(n>0){
            for (int i = 0; i < n; i++){
                System.out.print("* ");
            }
            System.out.println();
            patternRecur2(n-1);
        }
    }

    //4
    static float avg(int ...arr){
        int n = arr.length;
        float sum = 0;
        for (int ele: arr){
            sum += ele;
        }
        return sum/n;
    }
    public static void main(String[] args) {
        pattern(6);
        System.out.println("Sum of n natural:" + sumofnnatural(5));
        pattern2(4);
        System.out.println("avg: " + avg(1,2,3,4,5,7));
//        patternRecur(4);
        patternRecur2(4);
    }
}
