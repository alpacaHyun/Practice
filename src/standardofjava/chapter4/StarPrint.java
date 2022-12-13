package standardofjava.chapter4;

public class StarPrint {

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
