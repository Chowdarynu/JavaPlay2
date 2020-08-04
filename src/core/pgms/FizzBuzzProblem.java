package core.pgms;

//FizzBuzz PRgm:

/**
 * Print Fizz if its divisible by 3
 * Print Buzz if its divisible by 5
 * Print FizzBuzz if its divisible by 3 and 5
 *
 */
public class FizzBuzzProblem {
   public static void main(String[] args) {
      int num = 50;
      printFizzBusz(num);
   }

   private static void printFizzBusz(int num) {
      for (int i = 1; i < num; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
         } else if (i % 3 == 0) {
            System.out.println("Fizz");
         } else if (i % 5 == 0) {
            System.out.println("Buzz");
         } else {
            System.out.println(i);
         }
      }
   }
}
