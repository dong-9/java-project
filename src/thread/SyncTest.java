package thread;

public class SyncTest {
    public static Bank bank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Park park = new Park();
        park.start();
        Thread.sleep(200);

        ParkWife parkWife = new ParkWife();
        parkWife.start();

        ParkSon parkSon = new ParkSon();
        parkSon.start();

    }
}
