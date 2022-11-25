package inflearn.silverPark.chapter12.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);
    }
}

public class ComparatorTest {

    public static void main(String[] args) {

//        TreeSet<String> tree = new TreeSet<String>(); // 오름차순
        TreeSet<String> tree = new TreeSet<String>(new MyCompare());   // 내림차순 정렬 (MyCompare 확인해보면 알 수 있음)

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        System.out.println(tree);
    }

}
