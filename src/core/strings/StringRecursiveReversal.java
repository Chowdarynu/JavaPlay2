package core.strings;

public class StringRecursiveReversal {
   String reverse = "";

   public String reverse(String str) {
      if (str.length() == 1) {
         return str;
      } else {
         reverse += str.charAt(str.length() - 1)
            + reverse(str.substring(0, str.length() - 1));
         return reverse;
      }
   }

   public static void main(String a[]) {
      StringRecursiveReversal srr = new StringRecursiveReversal();
      System.out.println("Result: " + srr.reverse("Java 2 novice"));//Result: ecivon 2  avaJ
   }
}
