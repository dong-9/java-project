package thread;

public class Bank {
    private int money = 10000;

    public void saveMoney(int saveMoney){
        synchronized (this){
            int getMoney = getMoney();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setMoney(getMoney + saveMoney);
        }
    }

    public synchronized void minusMoney(int minusMoney){
        int getMoney = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setMoney(getMoney - minusMoney);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
