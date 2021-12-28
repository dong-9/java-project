package thread;

public class ParkWife extends Thread {
    @Override
    public void run() {
        System.out.println("ParkWife Minus Money Start");
        SyncTest.bank.minusMoney(1000);
        System.out.println("Minus Money Result: " + SyncTest.bank.getMoney());
    }
}
