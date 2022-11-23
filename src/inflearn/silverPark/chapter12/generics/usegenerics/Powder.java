package inflearn.silverPark.chapter12.generics.usegenerics;

public class Powder extends Material{
    public String toString() {
        return "재료는 파우더 입니다";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }
}
