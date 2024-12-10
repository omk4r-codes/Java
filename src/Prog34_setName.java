
public class Prog34_setName {
    public static void main(String[] args) {
        Employee deepika = new Employee();
        deepika.id = 100;
        deepika.name = "Deepeeeka";
        deepika.printDetails();
        deepika.getSalary();

        deepika.setName("Dipica");
        deepika.printDetails();

    }

}
