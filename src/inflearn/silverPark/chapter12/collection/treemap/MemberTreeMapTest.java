package inflearn.silverPark.chapter12.collection.treemap;

import inflearn.silverPark.chapter12.collection.Member;
import inflearn.silverPark.chapter12.collection.hashmap.MemberHashMap;

public class MemberTreeMapTest {

    public static void main(String[] args) {

        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(102, "이순신");
        Member memberKim = new Member(101, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberShin);

        memberTreeMap.showAllMember();

        // TreeMap 은 정렬이 된다 -> Integer(int 로 들어와도 autoboxing 이 된다. Wrapper 클래스로 autoboxing 된다)
        // Comparable 이 구현되어 있기 때문에
//        memberTreeMap.removeMember(101);
//        memberTreeMap.showAllMember();

    }
}
