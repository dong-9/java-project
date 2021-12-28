package thread;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 200; i++){
            System.out.print(i + " ");
        }
    }
}
