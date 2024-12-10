abstract class Pen{
    int price = 5;
    abstract void write();
    abstract void refill();
}

class Trimax extends Pen{
    int price = 50;

    @Override
    void write() {
        System.out.println("This is Trimax");
    }

    @Override
    void refill() {
        System.out.println("Refill can be done");
    }
}

class FountainPen extends Pen{
    int price = 100;
    @Override
    void write() {
        System.out.println("This is fountain Pen");
    }

    @Override
    void refill() {
        System.out.println("Refill cannot be done");
    }

    void changeNib(){
        System.out.println("Nib can be changed tho-");
    }
}
public class Prog47_Exercises {
    public static void main(String[] args) {
//        Trimax t = new Trimax();
//        System.out.println(t.price);
//        t.write();
//        t.refill();

        FountainPen fp = new FountainPen();
        System.out.println(fp.price);
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
