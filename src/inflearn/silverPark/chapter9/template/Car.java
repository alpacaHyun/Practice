package inflearn.silverPark.chapter9.template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();

    public void washCar(){}

    public void startCar(){
        System.out.println("시동을 겁니다");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public final void run() { // 변경되면 안되는 메서드, 오버라이딩 하면 안되기 때문에
        startCar();
        drive();
        wiper();
        stop();
        washCar(); // 필요에 따라 구현해서 사용하면 된다 .
        turnOff();
    }


}
