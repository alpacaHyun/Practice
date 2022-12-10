package codesquadtest.coordinate;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MakeStar makeStar = new MakeStar();
        MakeRevolution makeRevolution = new MakeRevolution();
        Scanner sc = new Scanner(System.in);
        String[][] universe = new String[100][100];

        String input = sc.nextLine();
        String[] inputArr = new String[2];
        inputArr = input.split(" ");

        int xCoordinate = Integer.parseInt(inputArr[0]);
        int yCoordinate = Integer.parseInt(inputArr[1]);

        universe = makeRevolution.makeCircle(80, universe);
        universe = makeStar.makeSun(5, universe);
//        universe = makeStar.makeEarth(3,universe,xCoordinate, yCoordinate);
//        universe = makeStar.makeEarth(3,universe);
        universe = makeStar.makeEarth(universe, xCoordinate, yCoordinate);
        for (int i = 0; i < universe.length; i++) {
            System.out.println(Arrays.toString(universe[i]));
        }
    }
}
