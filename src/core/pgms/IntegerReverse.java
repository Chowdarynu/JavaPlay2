package core.pgms;

public class IntegerReverse {
   public static void main(String[] args) {
      int num = 123;

      int rev = reverse(num);
      System.out.println(rev);
   }

   private static int reverse(int n) {
      int reverse = 0;
      while (n != 0) {
         reverse = reverse * 10 + n % 10;
         n = n / 10;
      }
      return reverse;
   }
}
