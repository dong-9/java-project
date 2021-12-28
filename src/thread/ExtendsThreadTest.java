package thread;

public class ExtendsThreadTest {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "start");   // main Thread
        ExtendsThread th1 = new ExtendsThread();                // th1 Thread
        ExtendsThread th2 = new ExtendsThread();                // th2 Thread
        th1.start();
        th2.start();
        System.out.println(Thread.currentThread() + "end");

    }
}
