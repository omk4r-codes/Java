// 2/+ functions with same name and different parameters

public class Prog29_MethodOverloading {
    static void greet(){
        System.out.println("hello user!");
    }

    static void greet(String name){
        System.out.println("hello " + name);
    }
    public static void main(String[] args) {
        greet();
        greet("Omkar");
    }
}
