package inflearn.silverPark.chapter12.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("James");
        sList.add("Edwards");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));
        // stream 안에 있는 요소들이 하나씩 들어오면 출력해라

        sList.stream().sorted().forEach(s-> System.out.println(s));
    }
}
