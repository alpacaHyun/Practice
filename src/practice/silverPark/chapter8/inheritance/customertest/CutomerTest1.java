package practice.silverPark.chapter8.inheritance.customertest;

import practice.silverPark.chapter8.inheritance.customer.Customer;
import practice.silverPark.chapter8.inheritance.customer.VIPCustomer;

public class CutomerTest1 {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10100, "Lee");

        Customer customerKim = new VIPCustomer(10101, "Kim", 100);
        // VIPCustomer 지만 Customer 로 생성함
//        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
    }
}

