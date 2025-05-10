package threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyRunnableCallable {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                3,
                3,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        //Usecase-1 : Runnable Example with only Runnable argument to submit()
        Future<?> futureObject1 = poolExecutor.submit(()->{
            System.out.println("Task1 with Runnable");
        });

        try{
            Object object = futureObject1.get();
            System.out.println(object == null);
        }catch(Exception e){
            e.printStackTrace();
        }

        //Usecase-2: Runnable and one more argument to submit(Runnable, T). It will return a value of type T.
        List<Integer> output = new ArrayList<>();

        Future<List<Integer>> futureObject2 = poolExecutor.submit(() -> {
            output.add(100);
            System.out.println("Task2 with Runnable and Return object");
        }, output);

        try{
            List<Integer> result = futureObject2.get();
            System.out.println(result.get(0));
        }catch(Exception e){
            e.printStackTrace();
        }

        //Usecase-3: passing Callable in submit(Callable<T>). It will return result of type T.
        Future<List<Integer>> futureObject3 = poolExecutor.submit(()->{
            System.out.println("Task3 with Callable");
            List<Integer> listObj = new ArrayList<>();
            listObj.add(200);
            return listObj;
        });

        try{
            List<Integer> outputFromFutureObject3 = futureObject3.get();
            System.out.println(outputFromFutureObject3.get(0));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
