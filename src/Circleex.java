import java.util.Scanner;

public class Circleex {

    public StringBuilder makeCircleEven(int circleSize) {
        StringBuilder circle = new StringBuilder();

        int size = circleSize / 2;

        int index = size - 1;
        int index2 = 0;
        int index3 = size - 1;
        int index4 = 0;

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    circle.append("-");
                } else {
                    circle.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index2 == i) {
                    circle.append("-");
                } else {
                    circle.append(" ");
                }
            }
            index--;
            index2++;
            circle.append("\n");
        }

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index4 == i) {
                    circle.append("-");
                } else {
                    circle.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index3 == i) {
                    circle.append("-");
                } else {
                    circle.append(" ");
                }
            }
            index3--;
            index4++;
            circle.append("\n");
        }

        return circle;
    }


}
