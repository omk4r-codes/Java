interface Bicycle {
    int noOfChains = 2;
    public void applyBrakes(int decrement);
    public void speedUp(int increment);
    default void applyGear(){
        System.out.println("Applying Gear 5th!");
    }
}

interface ThreeTyreBicycle extends Bicycle{
    void tyre3function();
}

class Avon implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee");
    }

    @Override
    public void applyBrakes(int decrement) {
        System.out.println("Applying brake...");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Increasing speed...");
    }
}

public class Prog45_Interfaces {
    public static void main(String[] args) {
        Avon myCycle = new Avon();
        myCycle.blowHorn();
        myCycle.applyBrakes(5);
        myCycle.speedUp(65);

        System.out.println(myCycle.noOfChains);
//        myCycle.noOfChains = 8;     ---> gives error
        System.out.println(myCycle.noOfChains);
    }
}
