package inflearn.silverPark.chapter12.collection;

import java.util.Collection;
import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
    // Comparable or Comparator 둘 중 하나만 (Comparator 는 기본생성자 만들어주어야함)
    public Member (){}

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String toString(){
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
    return memberId;
    }

    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberId - member2.memberId);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;

            if(this.memberId == member.memberId){
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member member) {

//        return (this.memberId - member.memberId);   // 이렇게 하면 멤버 아이디 오름차순으로 정렬된다. (this 는 나, member 는 매개변수)
//    return (this.memberName.compareTo(member.memberName)); // 이름 오름차순
    return (this.memberName.compareTo(member.memberName)) * (-1); // 이름 내림차순
    }

}
