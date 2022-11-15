package practice.silverPark.chapter8.inheritance.customertest;

import practice.silverPark.chapter8.inheritance.customer.Customer;
import practice.silverPark.chapter8.inheritance.customer.VIPCustomer;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(100010, "Lee");
        int price = customerLee.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " + customerLee.showCustomerInfo());

        Customer customerRim = new VIPCustomer(100011, "RIM", 100);
        price = customerRim.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " + customerRim.showCustomerInfo());

        Customer customerWho = new VIPCustomer(100010, "who", 100);
            price = customerWho.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " + customerWho.showCustomerInfo());
    }
}
