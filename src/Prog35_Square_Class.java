class Square{
    int side;

    public int getArea(){
        return side * side;
    }
    public int getPerimeter(){
        return side * 4;
    }
    public float getDiagonal(){
        return side * 1.41f;
    }
}

public class Prog35_Square_Class {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getDiagonal());
    }
}
