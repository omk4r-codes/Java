import java.util.Scanner;
public class Prog22_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax:
        int [] arr = new int [5];   // or int [] marks = {20, 30, 40}
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // for each loop
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
