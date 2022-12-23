package practice.polymorphism;

public class DiscountTenPercent implements Discount{

    @Override
    public double discountRate(int money) {
        return money * 0.9;
    }

}
