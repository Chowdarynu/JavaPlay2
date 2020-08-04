package core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodReference1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,12,433,5);

        Optional<Integer> max = integers.stream().reduce(Math::max);

        max.ifPresent(System.out::println);
        //or
        //max.ifPresent(value -> System.out.println(value));
    }
}
