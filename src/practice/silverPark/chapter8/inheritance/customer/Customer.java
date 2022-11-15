package practice.silverPark.chapter8.inheritance.customer;

public class Customer {

    private static final String SILVER = "SILVER";
    private static final String GOLD = "GOLD";
    private static final String VIP = "VIP";

    protected int price;
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;  // private 이어도 생성이 된다. (접근이 안되는 것)
    protected double bonusRatio;

//    public Customer() {
//        super(); // 모든 클래스의 최상위 클래스인 Object를 상속받았기 때문에 자동으로 들어감
//        customerGrade = SILVER;
//        bonusRatio = 0.01;
//    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer(int, String) 호출");
    }


    public int calcPrice(int price) {
        if (customerGrade == SILVER) {
            return bonusPoint += price * bonusRatio;
        }
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerGrade(){
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade){
        this.customerGrade = customerGrade;
    }

    public void setBonusPoint(int bonusPoint){
        this.bonusPoint = bonusPoint;
    }

}

