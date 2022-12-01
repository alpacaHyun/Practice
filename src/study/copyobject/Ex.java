package study.copyobject;

import java.util.ArrayList;
import java.util.List;

public class Ex {


    public static void main(String[] args) {
    Ex2 ex2 = new Ex2();
    Ex3 ex3 = new Ex3();

        int size = 0;

        System.out.println("사이즈를 입력하세요");
        size = ex3.readBridgeSize();

        List<String> randomBridge = new ArrayList<>();

        randomBridge = ex2.makeBridge(size);

        System.out.println(randomBridge);


    }
}
