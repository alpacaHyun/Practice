package inflearn.silverPark.chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<String>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int len = arrayQueue.size();

        if(len == 0){
            return "Queue 가 비었습니다";
        }
        return arrayQueue.remove(0);
        // remove 와 get 의 차이 -> remove 는 자료를 주고 사라짐, get 은 자료를 주고 남아있음
    }



}
public class QueueTest {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
