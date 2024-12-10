abstract class Parent{
    public Parent(){
        System.out.println("I am cons of Parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Yo!");
    }
}
public class Prog44_Abstract_Classes {
    public static void main(String[] args) {

    }
}
