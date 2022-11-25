package inflearn.silverPark.chapter12.collection.treeset;

import java.util.TreeSet;

// Collection 애들은 toString 이 구현되어 있다.

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> tree = new TreeSet();

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        // 정렬해서 들어감 , 하지만 Member 클래스의 경우 어떻게 비교할건지에 대해서 없음

        System.out.println(tree);

    }
}
