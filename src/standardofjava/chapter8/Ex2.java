package standardofjava.chapter8;

public class Ex2 {

    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(Integer.parseInt("s"));
        }catch (ArithmeticException | NumberFormatException error) {
            System.out.println(error.getMessage());
        }
        System.out.println(6);
    }
}
