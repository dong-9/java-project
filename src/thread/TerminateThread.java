package thread;

import java.io.IOException;

public class TerminateThread extends Thread {
    private Boolean flag = Boolean.FALSE;

    public TerminateThread(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(getName());
        while(!flag){
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {

        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");
        TerminateThread threadC = new TerminateThread("C");

        threadA.start();
        threadB.start();
        threadC.start();

        while (true){
            int flag = System.in.read();
            if(flag == 'A') threadA.setFlag(Boolean.TRUE);
            else if(flag == 'B') threadB.setFlag(Boolean.TRUE);
            else if(flag == 'C') threadC.setFlag(Boolean.TRUE);
            else if(flag == 'O') {
                threadA.setFlag(Boolean.TRUE);
                threadB.setFlag(Boolean.TRUE);
                threadC.setFlag(Boolean.TRUE);
                break;
            }
        }
    }
}
