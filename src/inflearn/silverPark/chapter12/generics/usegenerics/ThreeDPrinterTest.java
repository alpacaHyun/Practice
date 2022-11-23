package inflearn.silverPark.chapter12.generics.usegenerics;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        ThreeDPrinter<Powder> printPowder = new ThreeDPrinter<Powder>();
        // 참조할 타입인 Powder 대입
        printPowder.setMaterial(new Powder());

//        Powder powder = printPowder.getMaterial();
        // 반환하는 값은 Object 인데 값은 Powder 로 받았기 때문에 에러 발생

        Powder powder = printPowder.getMaterial(); // 캐스팅을 해주면 에러 해결

        System.out.println(printPowder);

        ThreeDPrinter<Plastic> printPlastic = new ThreeDPrinter<Plastic>();
        printPlastic.setMaterial(new Plastic());
        Plastic plastic = printPlastic.getMaterial();
        System.out.println(printPlastic);

        printPlastic.printing();
        printPowder.printing();

    }
}
