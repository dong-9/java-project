package thread;

public class Park extends Thread {
    @Override
    public void run() {
        System.out.println("Park Save Money Start");
        SyncTest.bank.saveMoney(3000);
        System.out.println("Save Money Result: " + SyncTest.bank.getMoney());
    }
}
