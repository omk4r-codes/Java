public class Prog26_Max_Min_in_array {
    public static void main(String[] args) {
        int[] arr = {56,21,75,99,23,10,9,42,15};
        // max:
        int max = Integer.MIN_VALUE;
        for (int i :arr){
            if(i > max)
                max = i;
        }

        System.out.println("Maximum: " + max);

        // min:
        int min = Integer.MAX_VALUE;
        for (int i :arr){
            if(i < min)
                min = i;
        }

        System.out.println("Minimum: " + min);

    }
}
