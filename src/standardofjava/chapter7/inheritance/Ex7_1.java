package standardofjava.chapter7.inheritance;

class Tv {
    boolean power;
    int chanel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++chanel;
    }

    void chanelDown() {
        --chanel;
    }

}
    class SmartTv extends Tv{ // SmartTv 는 Tv에 캡션(자막)을 보여주는 기능을 추가
        boolean caption;      // 캡션상태(on/off)
        void displayCaption(String text){
            if(caption){     //캡션 상태가 on(true)일 때만 text를 보여준다.
                System.out.println(text);
            }
        }
    }


    public class Ex7_1 {
        public static void main(String[] args) {

            SmartTv stv = new SmartTv();
            stv.chanel = 10;
            stv.channelUp();
            System.out.println(stv.chanel);

            stv.displayCaption("Hello World");
            stv.caption = true;      // 캡션(자막) 기능을 켠다.
            stv.displayCaption("Hello World");

        }
    }
