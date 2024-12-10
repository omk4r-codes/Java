// 1 java file can have only 1 public class
// if nothing's given then the access modifier is private by default

class Employee {
    // 3 attributes:
    int id;
    String name;
    int sal = 100;

    // method:
    public void printDetails(){
        System.out.println("My name is: " + name);
        System.out.println("And my id is: " + id);
        System.out.println("And my sal is: " + sal);
    }

    public void getSalary(){
        System.out.println("The salary of " + name + " is " + sal);
    }

    public void setName(String name){
        this.name = name;
        System.out.println("Name changed to " + name);
    }
}
public class Prog33_Classes {
    public static void main(String[] args) {
        Employee omkar = new Employee();
        omkar.id = 100;
        omkar.name = "Omkar";
//        System.out.println("Employee Name: " + omkar.name + " and id: " + omkar.id);
        omkar.printDetails();
        omkar.getSalary();

        Employee john = new Employee();
        john.id = 101;
        john.name = "John Cena";
        john.printDetails();
    }

}
