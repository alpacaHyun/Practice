package practice.silverPark.chapter9.gamelevel;

public abstract class PlayerLevel {

    int level;
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count) {

        if(level == 1){
            run();
        }else if(level == 2){
            run();
        }
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }

}
