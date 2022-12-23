package practice.polymorphism;

public class NoDiscount implements Discount{
    @Override
    public double discountRate(int money) {
        return money;
    }
}
