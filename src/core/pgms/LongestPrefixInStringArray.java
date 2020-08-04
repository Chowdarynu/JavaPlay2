package core.pgms;

public class LongestPrefixInStringArray {
   public static void main(String[] args) {
      String[] words = {"flow", "flowing", "flower"};
      String prefix = words[0];

      for (String word : words) {
         while (word.indexOf(prefix) != 0) {
            prefix = prefix.substring(0, word.length() - 1);
         }
      }
      if (!prefix.equals("")) {
         System.out.println("Prefix is:" + prefix);
      } else {
         System.out.println("There is no prefix");
      }
   }
}
