package practice.wootech.fourthweek;

import java.lang.reflect.Field;

public class Reflect {
    private byte abl = 80;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field fld = Reflect.class.getDeclaredField("abl");

        System.out.println("Is Accessible before : " + fld.isAccessible() );
        fld.setAccessible(true);
        System.out.println("Is Accessible after : " + fld.isAccessible() );
    }
}
