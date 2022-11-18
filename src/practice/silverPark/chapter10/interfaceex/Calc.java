package practice.silverPark.chapter10.interfaceex;

public interface Calc {

    // interface 는 아무런 선언을 하지 않아도 public static final 이 자동적으로 선언된다.

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 디폴트 메서드를 구현할땐 default 사용해 주어야 한다.  (default 를 안쓰면 public abstract 가 자동적으로 추가되기 때문
    default void description() {
        System.out.println("정수 계산기를 구현합니다. ");
    }

    // static (정적) 메서드는 인스턴스 생성과 상관없이 사용할 수 있다.
    static int total(int[] arr){
        int total = 0;

        for(int i : arr){
            total += i;
        }
        return total;
    }

}
