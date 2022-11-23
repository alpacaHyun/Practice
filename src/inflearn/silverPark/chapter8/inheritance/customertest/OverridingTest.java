package inflearn.silverPark.chapter8.inheritance.customertest;

import inflearn.silverPark.chapter8.inheritance.customer.Customer;
import inflearn.silverPark.chapter8.inheritance.customer.GOLDCustomer;
import inflearn.silverPark.chapter8.inheritance.customer.VIPCustomer;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(100010, "Lee");
        int price = customerLee.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " + customerLee.showCustomerInfo());

        // 하위 클래스가 상위 클래스로 업캐스팅 된다. (VIPCustomer로 생성하지만 Customer인 상위클래스로 업캐스팅 된다.)
        Customer customerRim = new VIPCustomer(100011, "RIM", 100);
        price = customerRim.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " + customerRim.showCustomerInfo());

        //(WhoCustomer로 생성하지만 Customer인 상위클래스로 업캐스팅 된다.)
        Customer customerWho = new VIPCustomer(100010, "who", 100);
            price = customerWho.calcPrice(10000);
        System.out.println("지불 금액은 " + price + "이고, " + customerWho.showCustomerInfo());

        //(GOLDCustomer 생성하지만 Customer인 상위클래스로 업캐스팅 된다.)
        Customer customerGold = new GOLDCustomer();
    }
}
