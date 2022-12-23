package practice.polymorphism;

public class Market {

    public static void main(String[] args) {

        int money = 1000;

//        Discount discount = new NoDiscount();
//        double answer = discount.discountRate(1000);
//
//        System.out.println(answer);

        Discount discount = new DiscountTenPercent();
        double answer = discount.discountRate(1000);

        System.out.println(answer);
    }

}
