package inflearn.silverPark.chapter12.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

//        Arrays.stream(arr); // 스트림이 생성된 것이다.
//        int sum = Arrays.stream(arr).sum();
//        System.out.println(sum);

        IntStream stream = Arrays.stream(arr);
        int sum = stream.sum();
        System.out.println(sum);

//        int count = (int)stream.count();
//        System.out.println(count);
        // stream 을 한번 사용했기 때문에 밑의 코드는 실행되지 않는다.
        // 따라서 스트림을 한번 더 생성해야 한다.

        int count = (int)Arrays.stream(arr).count();
        System.out.println(count);
    }
}
