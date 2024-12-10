import java.util.Scanner;

public class Prog24_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {21,32,19,26,18,66,45,39,64,89,75};
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                System.out.println("element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("element not found!");
    }
}
