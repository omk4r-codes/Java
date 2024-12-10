class Overridden{
    int x;

    public void meth1(){
        System.out.println("I am method1 of base class");
    }

    public void meth2(){
        System.out.println("Iam meth2 of base");
    }
}

class Overriding extends Overridden{
    @Override   // we can annotate like this to indicate the method is getting overridden
    public void meth1(){
        System.out.println("I got overridden by child class; i am method1 of child class here");
    }
}
public class Prog42_Method_Overriding {
    public static void main(String[] args) {
        Overriding og = new Overriding();
        og.meth1();
        og.meth2();
    }
}
