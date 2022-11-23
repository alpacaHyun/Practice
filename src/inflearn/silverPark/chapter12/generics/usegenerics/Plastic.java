package inflearn.silverPark.chapter12.generics.usegenerics;

public class Plastic extends Material{

    public String toString() {
        return "재료는 플라스틱 입니다";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
}
