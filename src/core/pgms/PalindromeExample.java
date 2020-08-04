package core.pgms;

class PalindromeExample {
   public static void main(String args[]) {
      int r, sum = 0, temp;
      int num = 454;

      temp = num;
      while (num > 0) {
         r = num % 10;
         sum = (sum * 10) + r;
         num = num / 10;
      }
      if (temp == sum) {
         System.out.println("palindrome number ");
      } else {
         System.out.println("not palindrome");
      }
   }
}  