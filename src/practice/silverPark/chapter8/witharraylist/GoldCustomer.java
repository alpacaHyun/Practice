package practice.silverPark.chapter8.witharraylist;

import practice.silverPark.chapter8.inheritance.customer.GOLDCustomer;

public class GoldCustomer extends Customer{

    double saleRatio;

    public GoldCustomer(){
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

//    @Override
//    public int calPrice(int price){
//        bonusPoint =
//
//    }
}
