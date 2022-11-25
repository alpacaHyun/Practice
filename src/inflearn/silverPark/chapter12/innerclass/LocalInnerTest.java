package inflearn.silverPark.chapter12.innerclass;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    public Runnable getRunnable(int i) {      // getRunnable 은 메서드인데 Runnable 이라는 객체를 구현해서, 반환한다

        final int localNum = 100;

        class MyRunnable implements Runnable{

            @Override
            public void run() {

                outNum += 10; // 인스턴스 변수이기 때문에 가능하다
//                localNum += 100;
//                i += 200;
                // 변수의 유효성 생각해보기
                // 메서드가 호출이 되면 메서드의 매개변수와 로컬변수는 스택에 자리를 잡음, 메서드의 호출이 끝나면 없어짐
                // 즉 run 이 실행될 시점에 매개변수와 로컬변수가 스택에서 사라질 수 있기 때문에 위의 두 코드는 에러가 발생

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }
        return new MyRunnable();

    }
}

public class LocalInnerTest {

    public static void main(String[] args) {

        Outer outer = new Outer();
//        outer.getRunnable().run();      // outer 객체의 getRunnable 의 run 메서드를 실행한다.

        Runnable runnable = outer.getRunnable(20);
        runnable.run();
    }

}
