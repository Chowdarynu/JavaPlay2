package core.datastructures.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargestInArrayExample2 {
    public static int getThirdLargest(Integer[] a, int size) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        return list.get(size - 3);
    }

    public static void main(String args[]) {
        Integer a[] = {1, 2, 5, 6, 3, 2};
        Integer b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Third Largest: " + getThirdLargest(a, 6));
        System.out.println("Third Largest: " + getThirdLargest(b, 7));
    }
}