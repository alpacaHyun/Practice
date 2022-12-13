package standardofjava.chapter4;

public class Continue {

    public static void main(String[] args) {
        int number = 0;
        while (number < 10) {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            System.out.println(number);
            number++;
        }
    }
}
