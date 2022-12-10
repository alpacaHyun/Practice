package codesquadtest.coordinate;

import java.util.Arrays;

public class CheckSize {

    public static void main(String[] args) {

        String[][] universe = new String[10][10];


        universe[4][7] = "*";
        universe[5][6] = "*";
        universe[5][8] = "*";
        universe[6][7] = "*";

        for (int i = 0; i < universe.length; i++) {
            for (int j = 0; j < universe.length; j++) {
                if(universe[i][j] == null){
                    universe[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < universe.length; i++) {
            System.out.println(Arrays.toString(universe[i]));
        }

    }
}
