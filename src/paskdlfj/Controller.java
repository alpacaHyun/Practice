package paskdlfj;

public class Controller {
    BridgeGame bridgeGame = new BridgeGame();
    private int moveIndex = 0;


    public void game() {
        bridgeGame.move(moveIndex);
        System.out.println(moveIndex);

        bridgeGame.move(moveIndex);
        System.out.println(moveIndex);

        bridgeGame.move(moveIndex);
        System.out.println(moveIndex);

        bridgeGame.move(moveIndex);
        System.out.println(moveIndex);
    }
}
