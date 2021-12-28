package thread;

public class JoinTest extends Thread{

    int start;
    int end;
    int total;

    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        System.out.println(currentThread() + "start");
        for(int i = start; i <= end; i++){
            total += i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread() + "Main Start");
        JoinTest join1 = new JoinTest(1, 50);
        JoinTest join2 = new JoinTest(51, 100);
        join1.start();
        join2.start();
        join1.join();
        join2.join();
        System.out.println(join1.total + join2.total);
        System.out.println(Thread.currentThread() + "Main End");

    }
}
