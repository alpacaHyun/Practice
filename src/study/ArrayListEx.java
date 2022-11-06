package study;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        list.add(1);
        list.add(2);

        int price = list.get(0);

        System.out.println(price);

        bw.write(price + "\n");
        bw.flush();
        bw.close();

        ArrayList<ArrayList<String>> onelist = new ArrayList<>();
    }
}
