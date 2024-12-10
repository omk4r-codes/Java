class Baap{
    public void Greet(){
        System.out.println("Papa hi keh rahe hai");
    }
    public void age(){
        System.out.println("My age is 54");
    }
    Baap(){
        System.out.println("Baap Baap hota hai");
    }
}

class Beta extends Baap{
    @Override
    public void Greet(){
        System.out.println("Hi from beta");
    }

    public void branch(){
        System.out.println("My branch is computers");
    }
    Beta(){
        System.out.println("beta kabhi bhi baap ki barabari nahi kr saktaa");
    }
}

public class Prog43_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Baap papa = new Beta(); // allowed
        // Beta son = new Baap();   // this isn't
        papa.Greet();   // bete ka method will be invoked

        papa.age();         // super class methods will be accessible
        // papa.branch();   // but subclass methods WILL NOT be accessible
    }
}
