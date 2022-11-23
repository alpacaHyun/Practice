package inflearn.silverPark.chapter10.interfaceex;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();

        //Buy 인터페이스에 있는 메서드만 구현 가능
        Buy buyer = new Customer();
        buyer.buy();

        // sell 인터페이스에 있는 메서드만 구현 가능
        Sell seller = new Customer();
        seller.sell();

        //즉 여러개의 인터페이스를 implements 해도 Open 된 인터페이스에 따라 사용할 수 있는 메서드들이 한정되어 있다.

        // 모두 Customer 에 있는 order() 가 호출됨  (Customer 에서 Override 됐기 때문)
        customer.order();
        buyer.order();
        seller.order();
    }
}
