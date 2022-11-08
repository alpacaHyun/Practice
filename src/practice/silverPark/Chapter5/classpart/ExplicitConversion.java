package practice.silverPark.Chapter5.classpart;

public class ExplicitConversion {
    public static void main(String[] args) {
        int iNum = 1000;
//        byte bNum = iNum;
        byte bNum = (byte) iNum;
        // 주의할 점 : iNum 의 값이 변하는 것은 아님, 이 값이 대입이 될 때 int 에서 byte로 바뀌어서 대입이 된다.
        System.out.println(iNum); //1000
        System.out.println(bNum); // -24

        double dNum = 3.14;
//        int iNum = dNum;
        iNum = (int) dNum;

        System.out.println(iNum); // 소숫점 부분은 사라지게 된다.
        float fNum = 0.9F;

        int num1 = (int) dNum + (int) fNum; // 더하기 전에 int 로 변하면서 소숫점 데이터 손실
        int num2 = (int) (dNum + fNum);    // 더한 후에 int 로 형변환 되면서 4.23 - >4로 됨

        System.out.println(num1);
        System.out.println(num2);

    }
}
