package practice.silverPark.chapter9.template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("AI가 운전합니다");
        System.out.println("AI가 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("AI가 멈춥니다. ");
    }

    @Override
    public void wiper() {
        System.out.println("자동으로 와이퍼가 작동합니다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동으로 세차합니다. ");
    }
}
