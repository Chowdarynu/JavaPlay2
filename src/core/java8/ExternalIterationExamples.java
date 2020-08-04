package core.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExternalIterationExamples {
    public static void main(String[] args){
        List<String> alphabets = Arrays.asList(new String[]{"a","b","b","d"});
        alphabets.forEach(String::toUpperCase);
    }
}