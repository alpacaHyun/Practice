package practice.wootech.thridweek;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {
    private static List<Integer> numbers = winnerNum();

    public static List getNumbers(){
        return numbers;
    }

    public static List<Integer> winnerNum(){
        System.out.println("번호를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split(",");
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            c.add(Integer.parseInt(b[i]));
        }
        return c;
    }


    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    static Lotto lotto = new Lotto(numbers);

    private void validate(List<Integer> numbers){
        if(numbers.size() != 6){
            throw new IllegalArgumentException("ERROR");
        }
    }
}
