package codesquadtest.coordinate;

public class MakeStar {

    private int upperLeftIndex;
    private int upperRightIndex;
    private int lowerLeftIndex;
    private int lowerRightIndex;


    public void makeMoon() {

    }

    public void initializeIndex(int size, int circleSize) {
        upperLeftIndex = size - 1;
        upperRightIndex = size;
        lowerLeftIndex = 0;
        lowerRightIndex = circleSize - 1;
    }

    public void initializeSunIndex(int size, int circleSize) {
        upperLeftIndex = (size - 1) + 47;
        upperRightIndex = 47 + size;
        lowerLeftIndex = 47;
        lowerRightIndex = (circleSize - 1) + 47;
    }

//    public void initializeEarthIndex(int size, int circleSize, int xCoordinate, int yCoordinate) {
//        upperLeftIndex = (size - 1);
//        upperRightIndex = size;
//        lowerLeftIndex = 0;
//        lowerRightIndex = (circleSize - 1);
//    }
    public void initializeEarthIndex(int size, int circleSize) {
        upperLeftIndex = (size - 1);
        upperRightIndex = size;
        lowerLeftIndex = 0;
        lowerRightIndex = (circleSize - 1);
    }

    public String[][] makeSun(int circleSize, String[][] circle) {
//        String[][] circle = new String[circleSize + 1][circleSize + 1];
        int size = (circleSize / 2) + 1;

        initializeSunIndex(size, circleSize);

        for (int i = 47; i < 47 + circleSize; i++) {
            for (int j = 47; j < circleSize + 48; j++) {
                circle = makeUpperCircle(i, j, circle);
            }
            upperLeftIndex--;
            upperRightIndex++;
        }

        for (int i =  47 +  size; i < 47 + circleSize; i++) {
            for (int j = 47; j < circleSize + 48; j++) {
                circle = makeLowerCircleOdd(i, j, circle);
            }
            lowerLeftIndex++;
            lowerRightIndex--;
        }

        for (int i = 47; i < 47 + circle.length; i++) {
            for (int j = 47; j < 47 + circle.length; j++) {
                circle = makeCircleNotNull(i, j, circle);
            }
        }
        return circle;
    }

//    public String[][] makeEarth(int circleSize, String[][] circle, int xCoordinate, int yCoordinate) {
//
//        int size = (circleSize / 2) + 1;
//
//        initializeEarthIndex(size, circleSize, xCoordinate, yCoordinate);
//
//        for (int i = 0; i < circleSize; i++) {
//            for (int j = 0; j < circleSize + 1; j++) {
//                circle = makeUpperCircle(i, j, circle);
//            }
//            upperLeftIndex--;
//            upperRightIndex++;
//        }
//
//        for (int i = size; i < circleSize; i++) {
//            for (int j = 0; j < circleSize + 1; j++) {
//                circle = makeLowerCircleOdd(i, j, circle);
//            }
//            lowerLeftIndex++;
//            lowerRightIndex--;
//        }
//
//        for (int i = 0; i < circle.length; i++) {
//            for (int j = 0; j < circle.length; j++) {
//                circle = makeCircleNotNull(i, j, circle);
//            }
//        }
//        return circle;
//    }

    public String[][] makeEarth(String[][] universe, int xCoordinate, int yCoordinate) {

        universe[yCoordinate][xCoordinate] = "*";
        universe[yCoordinate + 1][xCoordinate - 1] = "*";
        universe[yCoordinate + 1][xCoordinate + 1] = "*";
        universe[yCoordinate + 2][xCoordinate] = "*";


        return universe;
    }

    public String[][] makeLowerCircleOdd(int i, int j, String[][] circle) {
        if (j == lowerLeftIndex + 1) {
            circle[i][j] = "*";
        } else if (j == lowerRightIndex) {
            circle[i][j] = "*";
        } else {
            circle[i][j] = " ";
        }
        return circle;
    }

    public String[][] makeUpperCircle(int i, int j, String[][] circle) {
        if (upperLeftIndex == j) {
            circle[i][j] = "*";
        } else if (upperRightIndex == j) {
            circle[i][j] = "*";
        } else {
            circle[i][j] = " ";
        }
        return circle;
    }

    public String[][] makeCircleNotNull(int i, int j, String[][] circle) {
        for (i = 0; i < circle.length; i++) {
            for (j = 0; j < circle.length; j++) {
                if (circle[i][j] == null) {
                    circle[i][j] = " ";
                }
            }
        }
        return circle;
    }

}
