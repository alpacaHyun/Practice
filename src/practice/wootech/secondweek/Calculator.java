package practice.wootech.secondweek;



public class Calculator {

    public static final int SHARE_BIRTHDAY = 1104;// 상수, 클래스 변수인데 값이 변하지 않음

    public static int sharedResult = 0; // 클래스 변수
    // static 이 들어갔기 때문에 값이 공유됨
    // static 을 붙였기 때문에 static 변수

    public int result = 0; // 인스턴스 변수
    //dynamic이라고 생각하면 됨, 값을 어디서나 복사해서 마음대로 씀

    public Calculator(){ // 기본 생성자
    }

    public int add(int num1, int num2){ // 메서드
        result = num1 + num2;
        sharedResult = result;
        return result;
    }

}
