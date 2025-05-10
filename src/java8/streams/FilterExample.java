package java8.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterExample {

    Predicate<String> checkLength = (String str) -> str.length()<=3;

    Stream<String> nameString = Stream.of("Hello", "Everyone", "How", "Are", "You", "Doing");


}
