package inflearn.silverPark.chapter12.generics.general;

public class ThreeDPrinter {

    private Object material;
    // material 이 Powder 혹은 Plastic 일 수 있다.
    // 모든 클래스의 최상위 클래스는 Object 클래스이므로 형변환이 이루어진다.


    public Object getMaterial() {
        return material;
    }
    // material 이 Powder 혹은 Plastic 으로 들어오더라도 값이 지정된다.
    public void setMaterial(Object material) {
        this.material = material;
    }
}
