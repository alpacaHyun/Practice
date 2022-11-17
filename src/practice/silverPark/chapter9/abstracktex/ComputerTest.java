package practice.silverPark.chapter9.abstracktex;

public class ComputerTest {

    public static void main(String[] args) {

//        Computer c1 = new Computer();   // 추상 클래스는 인스턴스화 불가
        Computer c2 = new Desktop();
        Computer c3 = new MyNoteBook();

        c2.display();
        c3.display();
        // Computer 에는 구현 코드가 없기 때문에 각자에 있는 display가 실행
    }
}
