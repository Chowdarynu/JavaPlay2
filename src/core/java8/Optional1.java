package core.java8;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<Integer> canBeEmpty1 = Optional.of(5);
        System.out.println(canBeEmpty1.isPresent());                    // returns true
        System.out.println(canBeEmpty1.get());                          // returns 5


        Optional<Integer> possible = Optional.ofNullable(null);
        //System.out.println(possible.get());//NoSuchElementException: No value present
//or
        Optional<Integer> possible2 = Optional.ofNullable(5);
        System.out.println(possible2.get());//5


        Optional<Integer> canBeEmpty2 = Optional.empty();
        System.out.println(canBeEmpty2.isPresent());//false
    }
}
