package inflearn.silverPark.chapter12.lambda;

public class TestMyNumber {

    public static void main(String[] args) {

        MyNumber maxNum = (x, y) -> (x >= y) ? x : y;
        // 람다식은 최대한 생략할 수 있는 요소들을 생략하고 구현한다.
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);

        // 구현부와 선언부가 꼭 같은 필요는 없다.
        // 구현이 되어있고, 구현되어있는 내용을 기반으로

        int i = 100;

        MyNumber aaa = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                // 이 메서드 안에서 int i 는 상수로 취급되기 때문에 가져와서 사용은 가능하지만, 값을 변경하는 처리는 불가능하다.
                return 0;
            }
        };
    }
}
