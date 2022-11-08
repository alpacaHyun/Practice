package practice.silverPark.Chapter5.classpart;

public class ImplicitConversion { // 묵시적 형변환
    public static void main(String []args){
        byte bNum = 10; //한바이트
        int num = bNum; //네바이트

        System.out.println(num);

        long lNum = 10; // 자연스럽게 형변환 됨
        float fNum = lNum;

        System.out.println(fNum);

        double dNum = fNum + num; //floar 랑 int 더함 -> num 이 float로 자연스럽게 형변환 -> 더한 float 값이 double로 형변환

        System.out.println(dNum);
    }
}
