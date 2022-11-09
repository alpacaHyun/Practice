package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bronze1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strAnswer = str.split(" ");
        int[] answer = new int[strAnswer.length];
        for (int i = 0; i < strAnswer.length; i++){
            answer[i] = Integer.parseInt(strAnswer[i]);
        }

        int a = answer[0];
        int b = answer[1];
        int c = answer[2] - a;
        int d = answer[3] - b;

        int[] finalAnswer ={a, b, c, d};
        Arrays.sort(finalAnswer);

        System.out.println(finalAnswer[0]);
    }
}
