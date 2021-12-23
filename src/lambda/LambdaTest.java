package lambda;

public class LambdaTest {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("쓰레드1 시작");
                    Thread.sleep(3000);
                    System.out.println("쓰레드1 끝");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // run() 메서드를 람다식으로 변경
        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("쓰레드2 시작");
                Thread.sleep(5000);
                System.out.println("쓰레드2 끝");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.run();
        thread2.run();

    }

}
