package core.pgms;

public class StringPalindrome {
   public static void main(String[] args) {
      String s = "MADAM";

      isPalindrome(s);
   }

   private static void isPalindrome(String s) {
      boolean isPal = true;
      for (int i = 0; i < s.length() / 2; i++) {
         if (s.charAt(i) != s.charAt((s.length() - i - 1))) {
            isPal = false;
            break;
         }
      }

      if (isPal) {
         System.out.println(s + " is a Palindrome");
      } else {
         System.out.println(s + "is not a Palindrome");
      }
   }
}

