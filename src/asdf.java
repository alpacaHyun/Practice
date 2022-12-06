import java.util.Arrays;
import java.util.Collections;

public class asdf {

    public static void main(String[] args) {

        String[][] universe = new String[100][100];

        // sun
        universe[50][52] = "*";
        universe[50][53] = "*";
        universe[51][51] = "*";
        universe[51][54] = "*";
        universe[52][50] = "*";
        universe[52][55] = "*";
        universe[53][51] = "*";
        universe[53][54] = "*";
        universe[54][52] = "*";
        universe[54][53] = "*";

        // 지구
        universe[51][90] = "*";
        universe[52][89] = "*";
        universe[52][91] = "*";
        universe[53][90] = "*";

        //달
        universe[52][95] = "*";



//        String[][] earth = new String[][]

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

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < universe.length; i++) {
            for (int j = 0; j < universe.length; j++) {
                sb.append(universe[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);

//        for (int i = 0; i < array.length; i++) {
//            String a = Arrays.toString(array[i]);
//            System.out.println(a);
//        }

    }
}
