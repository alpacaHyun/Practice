package standardofjava.chapter7.inheritance;

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "입니다");
        System.out.println("현재 보너스 포인트는 " + b.bonusPoint + "입니다.");
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product {
    Computer(){
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1_000;
    int bonusPoint = 0;

    void buy(Product p) {
        {
            if (money < p.price) {
                System.out.println("잔액이 부족합니다.");
                return;
            }
            money -= p.price;
            bonusPoint += p.bonusPoint;
            System.out.println(p + " 제품을 구입하셨습니다.");
        }
    }

}
