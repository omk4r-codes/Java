public class Prog23_MDArrays {
    public static void main(String[] args) {
        int [][] aparts = new int[2][3];
        /*
            3 x 4 array
                1 2 3 4
                5 6 6 7
                2 5 9 8
        */

        aparts[0][0] = 100;
        aparts[0][1] = 101;
        aparts[0][2] = 102;
        aparts[1][0] = 200;
        aparts[1][1] = 201;
        aparts[1][2] = 202;


        for (int i = 0; i < aparts.length; i++){
            for (int j = 0; j < aparts[i].length; j++){
                System.out.print(aparts[i][j] + " ");
            }
            System.out.println();
        }
        // can be also done using for each:
        for (int[] flats : aparts) {
            for (int flat : flats) {
                System.out.print(flat + " ");
            }
            System.out.println();
        }
    }
}
