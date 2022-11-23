package inflearn.silverPark.chapter8.inheritance.customer;

public class GOLDCustomer extends Customer {

    public GOLDCustomer(){
        bonusRatio = 0.05;
    }
    @Override
    public int calcPrice(int price) {
        return calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }

    //@ 뒤에 이쓴ㄴ 것은 컴파일러에게 알려주는 주석같은 느낌 (애너테이션?)
    //https://bangu4.tistory.com/199
}
