package core.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InternalIterationExamples {
    public static void main(String[] args){
        List<String> alphabets = Arrays.asList(new String[]{"a","b","b","d"});
         
        Iterator<String> iterator = alphabets.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }

        //OR
        for(String letter: alphabets){
            System.out.println(letter.toUpperCase());
        }
    }
}