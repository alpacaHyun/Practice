package practice.polymorphism;

// 할인율 적용 전
public class NoDiscount implements Discount{
    @Override
    public double discountRate(int money) {
        return money;
    }
}
