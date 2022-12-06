import java.util.Arrays;
import java.util.Collections;

public class asdf {

    public static void main(String[] args) {

        String[][] sun = new String[100][100];

        sun[50][52] = "*";
        sun[50][53] = "*";
        sun[51][51] = "*";
        sun[51][54] = "*";
        sun[52][50] = "*";
        sun[52][55] = "*";
        sun[53][51] = "*";
        sun[53][54] = "*";
        sun[54][52] = "*";
        sun[54][53] = "*";




//        String[][] earth = new String[][]

        for (int i = 0; i < sun.length; i++) {
            for (int j = 0; j < sun.length; j++) {
                if(sun[i][j] == null){
                    sun[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < sun.length; i++) {
            System.out.println(Arrays.toString(sun[i]));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sun.length; i++) {
            for (int j = 0; j < sun.length; j++) {
                sb.append(sun[i][j]);
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
