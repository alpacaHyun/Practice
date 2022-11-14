package baekjoon.bronze;

// 별찍기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2441 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            for (int j = input - i; j < input; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < input; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
