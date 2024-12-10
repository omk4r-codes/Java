// Variables and Data Types:
//2 types of data types: Primitive & non primitive.
// non primitive are derived from primitive
// Primitive data types - includes byte, short, int, long, float, double, boolean and char
// Non-primitive data types - such as String, Arrays and Classes


public class Prog3_Variables_Data_Types {
    public static void main(String[] args){
        byte age = 18;  // takes 1 byte
        int mis = 112103120;    // takes 4 bytes
        long mo_no = 99226471;  // takes 8 bytes
        float marks = 125;  // takes 4 bytes
        double height = 165.6;  // takes 8 bytes
        char initial = 'o'; // takes 2 bytes (supports unicode)
        boolean willGetPlaced = true;

        // program to add 3 nos:
        int n1 = 1;
        int n2 = 5;
        int n3 = 6;
        int sum;
        sum = n1 + n2 + n3;
        System.out.println("The sum is: " + sum);
        System.out.println("The sum of "+ n1 +',' + n2 +" and " + n3 + " is " + sum);
    }
}
