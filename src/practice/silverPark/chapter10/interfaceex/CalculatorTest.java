package practice.silverPark.chapter10.interfaceex;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
//        Calc calc1 = new Clac(); // 인터페이스는 인스턴스 생성이 안된다.
//        Calculator calc = new CompleteCalc();  // 생성 가능
        System.out.println(calc.add(num1, num2));

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
