package codesquadtest.mission1.circle;

public class MakeCircle {

    public String[][] makeCircle(int circleSize) {
        String[][] circle = new String[circleSize+ 1][circleSize + 1];
        int size = circleSize / 2 ;

        int upperLeftIndex = size - 1;
        int upperRightIndex = size;
        int lowerLeftIndex = 0;
        int lowerRightIndex = circleSize - 1;

        for (int i = 10; i < size + 10; i++) {
            for (int j = 10; j < circleSize + 10; j++) {
                if(upperLeftIndex == j){
                    circle[i][j] = "-";
                }else if(upperRightIndex == j){
                    circle[i][j] = "-";
                } else {
                    circle[i][j] = " ";
                }
            }
            upperLeftIndex--;
            upperRightIndex++;
        }

        for (int i = size + 10; i < circleSize + 10; i++) {
            for (int j = 10; j < circleSize + 10; j++) {
                if(j == lowerLeftIndex){
                    circle[i][j] = "-";
                } else if (j == lowerRightIndex) {
                    circle[i][j] = "-";
                }else {
                    circle[i][j] = " ";
                }
            }
            lowerLeftIndex++;
            lowerRightIndex--;
        }

        return circle;
    }


    public String[][] makeCircleOdd(int circleSize) {
        String[][] circle = new String[circleSize][circleSize + 1];
        int size = (circleSize / 2) + 1;

        int upperLeftIndex = size - 1;
        int upperRightIndex = size;
        int lowerLeftIndex = 0;
        int lowerRightIndex = circleSize - 1;

        for (int i = 0; i < circleSize ; i++) {
            for (int j = 0; j < circleSize + 1 ; j++) {
                if(upperLeftIndex == j){
                    circle[i][j] = "-";
                }else if(upperRightIndex == j){
                    circle[i][j] = "-";
                } else {
                    circle[i][j] = " ";
                }
            }
            upperLeftIndex--;
            upperRightIndex++;
        }

        for (int i = size ; i < circleSize  ; i++) {
            for (int j = 0; j < circleSize + 1 ; j++) {
                if(j == lowerLeftIndex + 1){
                    circle[i][j] = "-";
                } else if (j == lowerRightIndex ) {
                    circle[i][j] = "-";
                }else {
                    circle[i][j] = " ";
                }
            }
            lowerLeftIndex++;
            lowerRightIndex--;
        }

        return circle;
    }
}
