package thread;

import java.util.concurrent.*;

public class CallableTest {

    public static Callable<Integer> init(String name){
        return new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                int n = 0;
                for(int i = 0; i < 3; i++){
                    n += i * 10;
                    System.out.println("I am "+ name +": " + n);
                }
                return n;
            }
        };
    }

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<Integer> task1 = init("E1");
        Callable<Integer> task2 = init("E2");

        Future<Integer> e1 = executorService.submit(task1);
        Future<Integer> e2 = executorService.submit(task2);

        try {
            System.out.println("E1 + E2 = " + (e1.get() + e2.get()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
