package threadpool;

import java.util.concurrent.CompletableFuture;

public class CompFutureExample {
    public static void main(String[] args) throws InterruptedException {

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 5*5).thenApply(result -> result + 10).thenApply(finalResult ->finalResult*2);
        completableFuture.thenAccept(System.out::println);

        Thread.sleep(500);

        }
    }

