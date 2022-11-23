package inflearn.silverPark.chapter10.interfaceex;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0){
            return num1 / num2;
        }
            return ERROR;

    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }

    @Override // 디폴트 메서드도 당연히 오버라이딩 가능하다
    public void description() {
        System.out.println("완변학 계산기 입니다. ");
    }
}
