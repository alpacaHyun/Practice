package codesquadtest.coordinate;

public class MakeRevolution {

    public String[][] makeCircle(int circleSize, String[][] circle) {
//        String[][] circle = new String[100][100];
        int size = circleSize / 2 ;

        int upperLeftIndex = (size - 1) + 10;
        int upperRightIndex = size + 10;
        int lowerLeftIndex = 10;
        int lowerRightIndex = (circleSize - 1) + 10;

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

}
