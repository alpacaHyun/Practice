package practice.silverPark.chapter9.abstracktex;

public abstract class Computer {

    public abstract void display(); // 구현을 하지 않고 선언만 함
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

}
