package inflearn.silverPark.chapter9.gamelevel;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level){    // Player 레벨인 이유 (슈퍼 혹은 어드벤스드 레벨이 들어갈 수 있기 때문)
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }

}
