class Animal {
    String name = "Animal";

    Animal(int a){
        System.out.println("I am animal constructor with " + a);
    }
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog(int a) {
        super(a);
        System.out.println("I am a dog");
    }

    void eat() {
        super.eat(); // Calls the eat() method of the Animal class
        System.out.println("Dog is eating");
    }

    void displayName() {
        System.out.println("Name from Animal: " + super.name); // Accesses the name variable of the Animal class
        System.out.println("Name from Dog: " + this.name);    // Accesses the name variable of the Dog class
    }
}

public class Prog41_Super {
    public static void main(String[] args) {
        Dog tommy = new Dog(69);
        tommy.eat();
    }
}
