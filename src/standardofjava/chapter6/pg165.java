package standardofjava.chapter6;

public class pg165 {
    public static void main(String [] args){
        Tv t = new Tv();

        t.channel = 7;
//        t.channelDown();
        System.out.println("현재 채널은 "+ t.channel +"입니다");

    }
}

class Tv{

    String color;               // 색상
    boolean power;              // 전원상태 (on / off)
    int channel;                 // 채널

    //TV 의 기능
//    void power() { power != power} //TV를 켜거나 끄거나 하는 기능
//    void channelUp() { ++channel };
//    void channelDown() { --channel };

}

