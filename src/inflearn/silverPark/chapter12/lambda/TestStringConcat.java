package inflearn.silverPark.chapter12.lambda;

public class TestStringConcat {

    public static void main(String[] args) {

        // 인터페이스 구현
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        // 람다
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);   // 반환값이 없으니깐 중괄호 생략 가능
        concat.makeString("hi", "java");

        // 그냥 구현
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        }; // 세미콜론 붙이는 이유가?

        // 람다와 그냥 구현은 같은 것이다.

        concat2.makeString("hello", "java");

        // 인터페이스 구현하기
        // 람다식으로 구현하기
        // 3번째와 같이 구현하기 , 익명 내부 클래스로도 구현할 수 있다.
        // 구현 한 것을 계속 재사용 한다면 클래스로 하는 것이 맞고
        //간단하게 구현해서 한번 쓰고 만다 하면, 람다식이나 익명내부클래스로 사용한다. 혹은 다른곳에 구현했다가 써도 된다.
        //하나의 인터페이스, 하나의 추상클래스만 사용할 수 있음,
        // 익명클래스를 사용하게 되면 하나의 인터페이스만 implement 할 수 있다.  - 람다식과 익명내부클래스는 하나의 인터페이스만 implemets 가능함
        // 일반적인 인터페이스 구현은 여러개 인터페이스 implements 할 수  있다.
    }

}
