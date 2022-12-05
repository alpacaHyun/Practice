public class CircleOdd {

    // 연습용 코드


    public StringBuilder makeCircle(int circleSize){
        StringBuilder oddCircle = new StringBuilder();

        int size = circleSize / 2;

        int index = size - 1;
        int index2 = 0;
        int index3 = size - 1;
        int index4 = 0;

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    oddCircle.append("-");
                } else {
                    oddCircle.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index2 == i) {
                    oddCircle.append("-");
                } else {
                    oddCircle.append(" ");
                }
            }
            index--;
            index2++;
            oddCircle.append("\n");
        }

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index4 == i) {
                    oddCircle.append("-");
                } else {
                    oddCircle.append(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index3 == i) {
                    oddCircle.append("-");
                } else {
                    oddCircle.append(" ");
                }
            }
            index3--;
            index4++;
            oddCircle.append("\n");
        }

        return oddCircle;
    }

}
