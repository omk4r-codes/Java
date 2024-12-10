public class Prog10_Exercise {
    public static void main(String[] args) {
//        q1. encrypt grades by adding 8 to it:
        char grade = 'B';
//        grade = grade + 8;
//        can't do like this since char + int = int
//        encrypting:
        grade = (char)(grade + 8);
        System.out.println(grade);
//        decrypting:
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
