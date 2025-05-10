package java8.types;

import java.util.function.Supplier;

public class SupplierImpl {
    public static void main(String[] args) {
        Supplier<String> message = () -> "This is the return message.";

        System.out.println(message.get());
    }
}
