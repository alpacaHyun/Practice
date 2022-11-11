package standardofjava.chapter11;

import java.io.IOException;
import java.util.*;

public class Ex09_ArrayListEx {
    public static void main(String[] args) throws IOException {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));  // new Integer 은 생략 가능
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) :" + list1.containsAll(list2)); // contains = true , false 를 출력한다.

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 인덱스가 3인 곳에 A 추가
        print(list1, list2);

        list2.set(3, "AA"); // 인덱스가 3인 곳을 AA로 변경
        print(list1, list2);

        // list1에서 list2와 겹치는 부분 말고는 다 삭제한다.
        System.out.println("list1.retainAll(list2) :" + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i = list2.size() -1 ; i >= 0; i--){
            if(list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }
    public static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : "+ list1);
        System.out.println("list2 : "+ list2);
        System.out.println();
    }
}
