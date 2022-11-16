package standardofjava.chapter7.inheritance;

public class Ex7_7 {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

//    fe.water();
//    car = fe;               // car = (Car)fe; 에서 형변환이 생략됨
//    fe2 = (FireEngine)car;       // 조상타입 -> 자손타입, 형변환 생략 불가
//    fe2.water();
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive brrr~~");
    }

    void stop() {
        System.out.println("Stop!");
    }

}

class FireEngine extends Car {
    void water() {
        System.out.println("Water!");
    }
}
