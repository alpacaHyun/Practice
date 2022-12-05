import java.util.Scanner;

public class Circle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder circle = new StringBuilder();
        StringBuilder circleOdd = new StringBuilder();
        Circleex circleex = new Circleex();
        CircleOdd circleOdd1 = new CircleOdd();

        System.out.println("짝수 원의 크기는?");
        int circleSize = sc.nextInt();

        circle = circleex.makeCircleEven(circleSize);

        System.out.println();

//        System.out.println("홀수 원의 크기는?");
//        int circleSize2 = sc.nextInt();
//        circleOdd = circleOdd1.


//        System.out.println(circle);

    }
//
//        System.out.println("원의 크기는? ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int size = a / 2;
//
//        int index = size - 1;
//        int index2 = 0;
//        int index3 = size - 1;
//        int index4 = 0;
//
//        for (int j = 0; j < size; j++) {
//            for (int i = 0; i < size; i++) {
//                if (index == i) {
//                    System.out.print("-");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            for (int i = 0; i < size; i++) {
//                if (index2 == i) {
//                    System.out.print("-");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            index--;
//            index2++;
//            System.out.println();
//        }
//
//        for (int j = 0; j < size; j++) {
//            for (int i = 0; i < size; i++) {
//                if (index4 == i) {
//                    System.out.print("-");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            for (int i = 0; i < size; i++) {
//                if (index3 == i) {
//                    System.out.print("-");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            index3--;
//            index4++;
//            System.out.println();
//        }
//
//    }
}