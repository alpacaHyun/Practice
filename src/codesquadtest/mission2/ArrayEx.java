package codesquadtest.mission2;

import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {

        StringBuilder[][] arr = new StringBuilder[3][3];
        StringBuilder sun = new StringBuilder();
        StringBuilder earth = new StringBuilder();
        StringBuilder moon = new StringBuilder();
        StringBuilder space = new StringBuilder();
        sun.append("**");
        earth.append("+");
        moon.append("-");
        space.append(" ");

        arr[0][0] = space;
        arr[0][1] = space;
        arr[0][2] = moon;

        arr[1][0] = space;
        arr[1][1] = earth;
        arr[1][2] = space;

        arr[2][0] = sun;
        arr[2][1] = space;
        arr[2][2] = space;

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        String[][] spaces = new String[10][10];

        spaces[5][5] = "***";


        for (int i = 0; i < spaces.length; i++) {

            System.out.println(Arrays.toString(spaces[i]));
        }



    }
}
