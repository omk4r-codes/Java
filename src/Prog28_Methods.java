public class Prog28_Methods {
    static float avg(int a, int b){
        return (float) (a + b) / 2;
    }

    // method w/o static:
    int sum(int a, int b){
        return a+b;
    }

    // changing values in method wont change it:
    static void change1(int n){
        n = 8;
    }

    static void change2(int [] arr){
        arr[0] = 76;
    }

    public static void main(String[] args) {
        System.out.println(avg(5,6));

        //we'll have to create an object of the class to use non-static method
        Prog28_Methods method1 = new Prog28_Methods();
        int addn = method1.sum(2,5);
        System.out.println(addn);

        int n = 4;
        System.out.println("n before changing:" + n);
        change1(n);
        System.out.println("n after changing:" + n);
        // value not changed


        // but array is aalways passed by reference. It'll change:
        int [] arr = {2,3,4,5,6};
        change2(arr);
        System.out.println("arr[0] after changing: " + arr[0]);
    }
}
