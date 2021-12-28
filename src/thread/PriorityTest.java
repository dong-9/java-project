package thread;

public class PriorityTest extends Thread {
    @Override
    public void run() {
        Thread thread = currentThread();
        System.out.println(thread + " start");
        for(int i = 1; i <= 10000; i++){
        }
        System.out.println(thread.getPriority() + " end");
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "Main start");
        for(int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++){
            PriorityTest priorityTest = new PriorityTest();
            priorityTest.setPriority(i);
            priorityTest.start();
        }
        System.out.println(Thread.currentThread() + "Main End");
    }
}
