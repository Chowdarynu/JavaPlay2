package core.pgms;

import java.util.HashMap;
import java.util.Map;

//It will return the index position of two numbers
public class TwoSumPrgm {
   public static void main(String[] args) {
      int[] num = new int[]{2,3,4,9,47};
      int target = 7;
      int[] res = getTwoSum(num, target);
      System.out.println(res[0]+" "+res[1]);
   }

   private static int[] getTwoSum(int[] num, int target) {

      Map<Integer, Integer> map =  new HashMap<>();
      for (int i=0; i<num.length;i++){
         int delta = target - num[i];
         if(map.containsKey(delta)) {
            return new int[]{i, map.get(delta)};
         }
         map.put(num[i], i);
      }
      return new int[]{-1, -1};//if not found, for error case
   }
}
