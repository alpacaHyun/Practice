package practice.silverPark.chapter8.witharraylist;

import practice.silverPark.chapter8.inheritance.customer.Customer;

public class VIPCustomer extends Customer {

    private double saleRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        ; // 입력해주지 않아도 원래 상위(부모)클래스가 자동으로 들어감(프리컴파일 단계에서)
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;

//        System.out.println("VIPCustomer(int, String) 호출");
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public int getAgentID() {
        return agentID;
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 ID는 " + agentID + "입니다.";
    }
}
