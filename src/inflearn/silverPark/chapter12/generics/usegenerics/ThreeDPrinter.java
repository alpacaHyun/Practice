package inflearn.silverPark.chapter12.generics.usegenerics;

public class ThreeDPrinter<T extends Material> {
                        // Material 을 상속받은 class 만 사용할 수 있다.
    private T material;
    // T 는 Object 로 변환, 컴파일러가 캐스팅 해줌
    // material 이 Powder 혹은 Plastic 일 수 있다.
    // 모든 클래스의 최상위 클래스는 Object 클래스이므로 형변환이 이루어진다.


    public T getMaterial() {
        return material;
    }
    // material 이 Powder 혹은 Plastic 으로 들어오더라도 값이 지정된다.
    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }

}
