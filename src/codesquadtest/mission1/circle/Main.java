package codesquadtest.mission1.circle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MakeCircle makeCircle = new MakeCircle();
        StringBuilder circleSb = new StringBuilder();


        String[][] circle = makeCircle.makeCircleOdd(sc.nextInt());

        for (int i = 0; i < circle.length; i++) {
            System.out.println(Arrays.toString(circle[i]));
        }

    }
}
