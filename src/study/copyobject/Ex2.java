package study.copyobject;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public List<String> makeBridge(int size) {
        List<String> bridge = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            bridge.add("U");
        }

        return bridge;
    }
}
