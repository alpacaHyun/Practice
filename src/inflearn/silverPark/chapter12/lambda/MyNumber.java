package inflearn.silverPark.chapter12.lambda;

@FunctionalInterface
public interface MyNumber {

    int getMaxNumber(int num1, int num2);

//    int testNumber(int x, int y);
}

// 람다식을 위한 함수형 인터페이스는 메서드를 딱 하나만 선언해야 한다.
// 위처럼 두 개 이상을 사용하게 되면, 람다식을 사용하면서 어떤 메서드인지 알 수 없기 때문이다.
// FunctionalInterface 라는 애너테이션을 넣어서 컴파일 에러를 방지
// 애너테이션을 넣으면 위의 인터페이스에서 새로운 함수를 구현하려고 할 때 빨간줄 생성되어서 에러를 막아준다.
