package playerlevel;

public class Player {

    private PlayerLevel level;

    public Player(){
        this.level = new BeginnerLevel();
    }

    public void upgradeLevel(PlayerLevel playerLevel){
        this.level = playerLevel;
    }

    public void play(int num){
        level.showLevelMessage();
        level.go(num);
    }
}
