package thread;

import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 10; i++){
            Runnable task = () -> {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                int poolSize = threadPoolExecutor.getPoolSize();
                String threadName = Thread.currentThread().getName();
                System.out.println("[총 스레드 개수 : "+poolSize+"] 작업 스레드 이름 :"+threadName);

//                 int exception = Integer.parseInt("우");
            };

//            executorService.execute(task);
            executorService.submit(task);
            Thread.sleep(2000);
        }

        executorService.shutdown();
    }
}
