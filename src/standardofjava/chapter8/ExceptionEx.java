package standardofjava.chapter8;

import java.util.Scanner;

public class ExceptionEx {

    public static void main(String[] args) {
        String a = "";
        int b = 0;
        Scanner sc = new Scanner(System.in);

        try{
            a = sc.nextLine();
            b = Integer.parseInt(a);
        }catch (NumberFormatException numberFormatException){
            System.out.println("숫자만 입력하세요");
        }catch(IllegalArgumentException illegalArgumentException){
            System.out.println("IllegalArgumentException");
        }

        System.out.println(b);
    }
}
