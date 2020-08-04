package core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvertStreamToArray{
     public static void main(String[] args){
         List<Integer> list = new ArrayList<>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         Stream<Integer> stream = list.stream();
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         for (Integer a :evenNumbersArr) {
             System.out.print(a);
         }
     }
}