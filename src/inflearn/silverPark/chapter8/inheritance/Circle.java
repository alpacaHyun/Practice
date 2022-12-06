package inflearn.silverPark.chapter8.inheritance;

public class Circle {
    // 여기서 codesquadtest.mission1.Circle 과 Point 는 x,y를 다 가지고 있다고 해서 codesquadtest.mission1.Circle 이 Point 를 상속받지 않는다.
    // codesquadtest.mission1.Circle 과 Point 는 아무 관계가 아니고 활용만 하고 싶을 땐
//    private int x;
//    private int y;

    Point point; // has - a 관계 (is - a 관계)

    private int radius;

    public Circle(){
        point = new Point();
        // 이렇게 생성자를 생성해서 Point 안에 있는 메서드를 활용할 수 있다.
    }
}
