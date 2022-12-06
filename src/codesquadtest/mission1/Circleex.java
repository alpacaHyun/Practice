package codesquadtest.mission1;

public class Circleex {

    public StringBuilder makeCircleEven(int circleSize) {
        StringBuilder evenCircle = new StringBuilder();
        StringBuilder evenCircleDown = new StringBuilder();
        int size = circleSize / 2;

        int index = size - 1;
        int index2 = 0;
        int index3 = size - 1;
        int index4 = 0;


        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    evenCircle.append("-");
                } else {
                    evenCircle.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index2 == i) {
                    evenCircle.append("-");
                } else {
                    evenCircle.append(" ");
                }
            }
            evenCircle.append("\n");
            index--;
            index2++;
        }

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index4 == i) {
                    evenCircle.append("-");
                } else {
                    evenCircle.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index3 == i) {
                    evenCircle.append("-");
                } else {
                    evenCircle.append(" ");
                }
            }
            evenCircle.append("\n");
            index3--;
            index4++;
        }
return evenCircle;
    }

    public StringBuilder makeCircleOdd(int circleSize) {

        StringBuilder oddCircle = new StringBuilder();
        StringBuilder oddCircleUp = new StringBuilder();
        StringBuilder oddCircleDown = new StringBuilder();

        int size = (circleSize / 2) + 1;

        int index = size - 1;
        int index2 = 0;
        int index3 = size - 1;
        int index4 = 0;

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    oddCircleUp.append("-");
                } else {
                    oddCircleUp.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index2 == i) {
                    oddCircleUp.append("-");
                } else {
                    oddCircleUp.append(" ");
                }
            }
            index--;
            index2++;
            oddCircleUp.append("\n");
        }

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index4 == i) {
                    oddCircleDown.append("-");
                } else {
                    oddCircleDown.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index3 == i) {
                    oddCircleDown.append("-");
                } else {
                    oddCircleDown.append(" ");
                }
            }
            oddCircleDown.append("\n");
            if(index4 == 0) {
                oddCircleDown.delete(0,oddCircleDown.length());
            }
            index3--;
            index4++;
        }
        oddCircle.append(oddCircleUp).append(oddCircleDown);


        return oddCircle;
    }

    public StringBuilder oneCircle(int circleSize) {
        StringBuilder oneCircle = new StringBuilder();
        oneCircle.append("-");
        return oneCircle;
    }



}
