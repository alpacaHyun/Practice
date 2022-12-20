package inflearn.silverPark.chapter12.generics.againgenerics;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();

        printer.setMaterial(new Powder());

        Powder powder = printer.getMaterial();   // 반환 값은 Object 인데 Powder 로 받았기 때문에 Casting 을 해주어야 한다.

        System.out.println(printer);


        ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
        printer2.setMaterial(new Plastic());
        Plastic plastic = printer2.getMaterial();
        System.out.println(printer2);


    }

}
