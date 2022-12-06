package codesquadtest.mission1;

import java.util.Scanner;

public class circlkjasdf {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
//        int a =sc.nextInt();
        int a = 7;
        int size =  (a / 2) + 1;

        int index = size - 1;
        int index2 = 0;



        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (index2 == i) {
                    sb.append("-");
//                    System.out.print("-");
                } else {
                    sb.append(" ");
//                    System.out.print(" ");
                }
            }
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    sb.append("-");
//                    System.out.print("-");
                } else {
                    sb.append(" ");
//                    System.out.print(" ");
                }
            }
            sb.append("\n");
            if(index2 == 0){
                sb.delete(0,sb.length());
            }
            index--;
            index2++;
//            System.out.println();
        }


        System.out.println(sb);
        System.out.println();
    }
}
