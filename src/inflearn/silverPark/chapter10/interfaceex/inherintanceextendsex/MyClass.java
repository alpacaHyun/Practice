package inflearn.silverPark.chapter10.interfaceex.inherintanceextendsex;

public class MyClass implements MyInterface{

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.x();
        myClass.y();
        myClass.myMethod();

        X x = new MyClass();
        x.x();

        Y y = new MyClass();
        y.y();

        // Class 인스턴스가 생성됐다고 해도 인스턴스가 어떤 타입에 대입이 됐느냐에 따라 사용할 수 있는 메서드는 한정적이다.
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

}
