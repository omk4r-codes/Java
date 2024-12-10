public class Prog20_Break_Continue {
    public static void main(String[] args) {

        System.out.println("BREAK");
        for (int i = 0; i < 5; i++){
            System.out.println(i + " Java is Great!");
            if (i == 2){
                System.out.println("Ending the loop");
                break;
            }
        }

        System.out.println("CONTINUE");
        for (int i = 0; i < 5; i++){
            if (i == 2){
                System.out.println("Donot execute when i = 2, just continue");
                continue;
            }
            System.out.println(i + " Java is Great!");
        }
    }
}
