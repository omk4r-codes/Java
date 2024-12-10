public class Prog27_Find_WhetherArrayIsSorted {
    public static void main(String[] args) {
//        int[] arr = {56,21,75,99,23,10,9,42,15};
        int[] arr = {1,2,3,4,5,6};

        boolean shift = false;
        for (int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                shift = true;
                break;
            }
        }
        if(shift)
            System.out.println("Not sorted");
        else
            System.out.println("Sorted");

    }
}
