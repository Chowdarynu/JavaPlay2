package core.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortElements
{
    public static void main(String[] args)
    {
        Stream<Integer> numStream = Stream.of(1,3,5,4,2);
        numStream.sorted(Comparator.reverseOrder())
                 .forEach(System.out::println);
    }
}
//numStream.sorted()