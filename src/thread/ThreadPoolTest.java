package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {

        // 자동으로 스레드 수 생성
        ExecutorService executorServiceWithCached = Executors.newCachedThreadPool();
        //
    }
}
