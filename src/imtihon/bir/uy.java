package imtihon.bir;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class uy {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10000; i++) {
            executorService.execute(()->{
                counter.increamt();
            });
        }
        Thread.sleep(1000);
        System.out.println(counter.getCount());
    }
}
