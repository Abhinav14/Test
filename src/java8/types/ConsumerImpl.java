package java8.types;

import java.util.function.Consumer;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<Integer> loggingObj = (Integer val) -> {
            if(val>10){
                System.out.println("Value is greater than 10");
            }
        };
        loggingObj.accept(15);
    }
}
