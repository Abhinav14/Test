package threadpool;

import java.util.concurrent.*;

public class MyCompletableFuture {
    public static void main(String[] args) {

        try{
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                    1,
                    1,
                    10,
                    TimeUnit.MINUTES,
                    new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
                return "Task completed!";
            }, poolExecutor);
            //asyncTask1.get() will wait for the task to complete and return result.
            System.out.println(asyncTask1.get());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
