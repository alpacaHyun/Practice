package inflearn.silverPark.chapter12.innerclass;

import inflearn.silverPark.chapter12.innerclass.OutClass.InStaticClass;
import java.util.ArrayList;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;


    public OutClass() {
        inClass = new InClass();
    }


    private class InClass {
        int inNum = 200;
//        static sInNum = 100; // static 은 인스턴스의 생성에 상관없이 호출하고 사용할 수 있다.

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }


    }

    public void usingInTest() {
        inClass.inTest();
        // private 으로 막고 이런 식으로 호출해서 사용해야 한다.
        // 내가 기존처럼 다른 클래스에서 생성하는 것이 아니라
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
//            num += 10;       // num 이 static 이 아니기 때문에 사용 불가능
            sNum += 10;        // sNum 이 static 이기 때문에 사용 가능
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
            System.out.println(sInNum);
        }

    }


}


public class InnerTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass();       // 이러면 InClass도 생성이 된다.
        outClass.usingInTest();

//        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
//        sInClass.inTest();

        OutClass.InStaticClass.sTest();

    }
}
