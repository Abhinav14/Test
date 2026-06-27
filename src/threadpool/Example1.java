package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//ExecutorService - create a pool of 3 threads
public class Example1 {
    public static void main(String[] args) {
        //create a pool of 3 threads
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(() -> System.out.println("Task 1"));
        service.submit(() -> System.out.println("Task 2"));
        service.submit(() -> System.out.println("Task 3"));
        service.shutdown();
    }
}
