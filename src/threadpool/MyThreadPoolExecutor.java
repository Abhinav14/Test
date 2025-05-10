package threadpool;

import java.util.concurrent.*;

public class MyThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectHandler());

        for(int i = 1; i <=7; i++){
            //submit task by calling submit(). This submit() takes instance of Runnable as argument
            poolExecutor.submit(()->{
                try{
                    Thread.sleep(5000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("Task processed by: "+Thread.currentThread().getName());
            });
        }
        //once everything is complete executor must call shutDown()
        poolExecutor.shutdown();
    }
}
