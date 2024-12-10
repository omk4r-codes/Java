public class Prog11_Strings {
    public static void main(String[] args) {
        String name = "Omkar";
        System.out.println(name);
        // or the below also works but above preferred
        String name2 = new String("Tanishka");
        System.out.println(name2);

        // STRINGS ARE IMMUTABLE AND CANNOT BE CHANGED, i.e., no appending etc; A COPY MIGHT BE CHANGED
        name += "Salunke";
        System.out.println(name);

        // printf:
        int a = 9;
        float b = 8.7f;
        System.out.printf("the value of a is %d and value of b is %f", a, b);
        System.out.format("the value of a is %d and value of b is %f", a, b);   // also works same
    }
}
