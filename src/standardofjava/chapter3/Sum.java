package standardofjava.chapter3;

public class Sum {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        System.out.println(i++);   // 0 -> sysout 후 ++이 되기 때문이다.
        System.out.println(++j);   // 1 -> sysout 전 ++이 되기 때문이다.
    }
}
