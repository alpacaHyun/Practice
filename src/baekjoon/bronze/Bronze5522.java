package baekjoon.bronze;
/*
JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임이다.
JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하라.
랜덤이 아닌 주어졌을 때 이다.
 0 ≤ Ai ≤ 100.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bronze5522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int result = 0;

        for (int i = 0; i < 6; i++) {
            result += sc.nextInt();
        }

        System.out.println(result);
    }

}
