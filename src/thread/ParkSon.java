package thread;

public class ParkSon extends Thread {
    @Override
    public void run() {
        synchronized (SyncTest.bank){
            System.out.println("ParkSon Save Money Start");
            SyncTest.bank.saveMoney(3000);
            System.out.println("SaveSon Money Result: " + SyncTest.bank.getMoney());
        }
    }
}
