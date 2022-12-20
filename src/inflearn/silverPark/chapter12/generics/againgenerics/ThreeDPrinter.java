package inflearn.silverPark.chapter12.generics.againgenerics;

public class ThreeDPrinter<T> {

    private T material; // 오브젝트는 모든 클래스의 최상위 클래스

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString();
    }

}
