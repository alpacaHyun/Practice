package inflearn.silverPark.chapter12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        boolean a = set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set); // aaa, ccc, bbb 이렇게 순서대로 출력되지 않음

        boolean b = set.add("aaa");

        System.out.println(set); // aaa 가 두번 호출되지 않음

        System.out.println(a); // true aaa 가 들어갔기 때문
        System.out.println(b); // false aaa 가 존재해서 들어가지 못했기 때문

    }
}
