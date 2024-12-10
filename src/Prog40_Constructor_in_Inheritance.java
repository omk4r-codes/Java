class Base1{
    Base1(){
        System.out.println("Hi i am base constructor");
    }
    Base1(int a){
        System.out.println("Overloaded cons with a: " + a);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(7);
        System.out.println("Im derived constructor");
    }
}

public class Prog40_Constructor_in_Inheritance {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
    }
}
