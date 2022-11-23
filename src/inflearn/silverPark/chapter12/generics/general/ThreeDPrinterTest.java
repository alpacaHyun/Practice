package inflearn.silverPark.chapter12.generics.general;


import inflearn.silverPark.chapter12.generics.general.Powder;
import inflearn.silverPark.chapter12.generics.general.ThreeDPrinter;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        ThreeDPrinter printer = new ThreeDPrinter();

        printer.setMaterial(new Powder());

//        Powder powder = printer.getMaterial();
        // 반환하는 값은 Object 인데 값은 Powder 로 받았기 때문에 에러 발생

        Powder powder = (Powder) printer.getMaterial(); // 캐스팅을 해주면 에러 해결
    }
}
