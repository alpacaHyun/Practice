package standardofjava.chapter11;

import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Ex11_19 {

    public static void main(String[] args) {

        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2);  // 오른쪽으로 2만큼 이동
        System.out.println(list);

        swap(list, 0, 2);  // 첫번째와 세번째 교환
        System.out.println(list);

        shuffle(list); // 임의로 섞기
        System.out.println(list);

        sort(list, reverseOrder()); // 역순정렬
        System.out.println(list);

        sort(list);                 // 정렬
        System.out.println(list);

        int idx = binarySearch(list, 3); // 3이 저장된 위치 반환
        System.out.println(idx);

        System.out.println(max(list));
        System.out.println(min(list));

        fill(list, 9); // 9로 채운다
        System.out.println(list);

        List newList = nCopies(list.size(), 2); // list 와 같은 크기의 새로운 list 생성하고 2로 채운다, 단 결과는 변경 불가
        System.out.println(newList);

//        newList.add(1); // UnsupportedOperationException 발생

        copy(list, newList);
        System.out.println(list);

        replaceAll(list, 2, 1); // 2를 1로 변경
        System.out.println(list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println(list2);

    }
}
