package standardofjava.chapter12;

import static standardofjava.chapter12.Enum.EnumConstant.East;

public class Enum {

    public static void main(String[] args) {
        if(East.compareTo(East ) > -1) {
            System.out.println(1);
        }
        System.out.println(East);

    }
        static enum EnumConstant {
            East

        }
}
