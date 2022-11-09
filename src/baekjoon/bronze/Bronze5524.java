package baekjoon.bronze;

//        JOI회사에서는 방에 들어가기 위해 입실 기록을 입력할 때 알파벳으로 이름을 입력한다. 그런데, 컴퓨터에 오류가 나서 대문자 소문자가 섞여버려 입실 기록이 읽기 힘들어졌다.
//        JOI회사의 입실 기록을 읽기 쉽게 하기 위해서 기록된 이름을 모두 소문자로 변환하는 프로그램을 작성하라. 단, 입실 기록에는 같은 이름의 사람이 생기기도 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5524 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputUser = br.readLine();
        String [] inputSplit = inputUser.split("");
        int a = 3;
        int b = 4;

//        for(int i = 0; i < inputSplit.length; i++){
//            if (inputSplit[i].contains(b)) {
//                break;
//            } else {
//                inputSplit[i].toLowerCase();
//                System.out.print(inputSplit[i]);
//            }
//        }





    }
}
