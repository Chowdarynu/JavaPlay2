package core.strings;

public class StringReverse {

   public static void main(String a[]) {
      String str = "Hello World";
      StringBuilder sb = new StringBuilder(str);
      System.out.println(sb.reverse().toString());

      String rev = reverseManually(str);
      System.out.println(rev);
   }

   private static String reverseManually(String str) {
      StringBuilder sb = new StringBuilder();
      for (int i = str.length() - 1; i >= 0; i--) {
         sb.append(str.charAt(i));
      }
      return sb.toString();
   }
   //Instead of Stringbuilder we can use String to append but it expensive and inefficient
}
