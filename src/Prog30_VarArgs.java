// variable no. of arguments pased to a fn

public class Prog30_VarArgs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    what if we need to do sum of any 3 or 4 or 5 or n numbers??


    static int sum (int ...arr){    // this means jitne bhi arguments hai muze array me pass krke de do
        // so this can be interpreted as int [] arr;
        int sum = 0;
        for (int ele : arr){
            sum += ele;
        }
        return sum;
    }


    // If you want at least one parameter:
//    static int sum (int x,int ...arr){    // this means jitne bhi arguments hai muze array me pass krke de do
//        // so this can be interpreted as int [] arr;
//        int sum = x;
//        for (int ele : arr){
//            sum += ele;
//        }
//        return sum;
//    }

    // But remember you cannot overload this function since it will give an error like reference to sum is ambiguous

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(sum(1,2,3));
        System.out.println(sum());  // res = 0

    }
}
