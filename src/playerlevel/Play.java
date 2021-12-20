package playerlevel;

public class Play {
    public static void main(String[] args) {

        Player p1 = new Player();
        p1.play(1);

        System.out.println();

        p1.upgradeLevel(new AdvancedLevel());
        p1.play(2);
    }
}
