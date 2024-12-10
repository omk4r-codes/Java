class Base{
    int x;

    public void printMe(){
        System.out.println("This is base class!");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Prog39_Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(6);
        d.setY(7);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
