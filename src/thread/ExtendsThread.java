package thread;

public class ExtendsThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 200; i++){
            System.out.print(i + " ");
        }
    }
}
