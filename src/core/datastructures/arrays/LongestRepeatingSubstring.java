package core.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatingSubstring {
   public static void main(String[] args) {
      String str = "abcdbc";

      int len = lengthOfLongestSubstring(str);
      System.out.println(len);
   }

   private static int lengthOfLongestSubstring(String str) {
      int a_pointer = 0;
      int b_pointer = 0;
      int max = 0;

      Set<Character> set = new HashSet<>();

      while (b_pointer < str.length()) {
         if (!set.contains(str.charAt(b_pointer))) {
            set.add(str.charAt(b_pointer));
            b_pointer++;
            max = Math.max(set.size(), max);
         } else {
            set.remove(str.charAt(a_pointer));
            a_pointer++;
         }
      }
      return max;
   }
}
