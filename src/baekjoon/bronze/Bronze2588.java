package baekjoon.bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2588{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B%10));
        sb.append('\n');

        sb.append(A * ((B%100)/10));
        sb.append('\n');

        sb.append(A * (B/100));
        sb.append('\n');

        sb.append(A * B);

        System.out.print(sb);

    }

}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Bronze2588 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String a = br.readLine();
//        String b = br.readLine();
//
//        String[] first = a.split("");
//        String[] second = b.split("");
//
//        int[] one = new int[first.length];
//        int[] two = new int[second.length];
//        int[] three = new int[4];
//        int[] four = new int[4];
//        int[] five = new int[5];
//
//        for (int i = 0; i < first.length; i++) {
//            one[i] = Integer.parseInt(first[i]);
//        }
//        for (int i = 0; i < second.length; i++) {
//            two[i] = Integer.parseInt(second[i]);
//        }
//
//        three[0] = (one[0] * two[0]) % 10;
//        three[1] = (one[0] * two[1]) % 10 + ((one[1] * two[0]) / 10);
//        three[2] = (one[0] * two[2]) % 10 + ((one[1] * two[1]) / 10);
//        three[3] = ((one[0] * two[2]) / 10);
//
//        four[0] = (one[1] * two[0]) % 10;
//        four[1] = (one[1] * two[1]) % 10 + ((one[1] * two[0]) / 10);
//        four[2] = (one[1] * two[2]) % 10 + ((one[1] * two[1]) / 10);
//        four[3] = ((one[1] * two[2]) / 10);
//
//        five[0] = (one[2] * two[0]) % 10;
//        five[1] = (one[2] * two[1]) % 10 + ((one[2] * two[0]) / 10);
//        five[2] = (one[2] * two[2]) % 10 + ((one[2] * two[1]) / 10);
//        five[3] = ((one[2] * two[2]) / 10);
//
//        int[] answer = new int[6];
//        answer[0] = three[0];
//        answer[1] = three[1] + four[0];
//        answer[2] = three[2] + four[1] + five[0];
//        answer[3] = three[3] + four[2] + five[1];
//        answer[4] = four[3] + five[2];
//        answer[5] = five[3];
//
//        for (int i = 0; i < three.length; i++){
//            System.out.println(three[i]);
//        }
//
//    }
//}
// 메소드화 하면 더 간단하게 할 수 있는데, for 문으로 더 간단히는 못하나..
