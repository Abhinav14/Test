package threadpool;

import java.util.concurrent.*;

public class MyFuture {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                1,
                1,
                1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        Future<?> futureObj = poolExecutor.submit(()->{
            try{
                Thread.sleep(7000);
            }catch(Exception e){
                e.printStackTrace();
            }
        });
        //checking if the task execution is finished or not.
        System.out.println("is Done: "+futureObj.isDone());

        //Caller thread(which is main thread here) will wait for the specified time(2 seconds) for result.
        // Post 2seconds, it will throw exception coz thread is forced to sleep for 7 seconds.
        try{
            futureObj.get(2, TimeUnit.SECONDS);
        }catch(TimeoutException e){
            System.out.println("Timeout Exception Occurred");
        }catch(Exception ex){
            ex.printStackTrace();
        }

        //Caller thread(main thread) will wait for task to be completed to get result.
        try{
            futureObj.get();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        //checking again if task execution is done
        System.out.println("is Done: "+futureObj.isDone());
        System.out.println("is Cancelled: "+futureObj.isCancelled());
    }
}
