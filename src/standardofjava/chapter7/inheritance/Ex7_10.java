package standardofjava.chapter7.inheritance;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new DropShip()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop(){}
}

class Marine extends Unit {
    void move(int x, int y){
        System.out.println("Marine move x, y");
    }
    void steamPack(){}
}

class Tank extends Unit {
    void move(int x, int y){
        System.out.println("Tank move x, y");
    }
    void changeMode(){}
}

class DropShip extends Unit {
    void move(int x, int y){
        System.out.println("DropShip move x, y");
    }
    void load(){}
    void unLoad(){}
}

