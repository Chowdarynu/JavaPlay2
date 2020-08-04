package core.datastructures.arrays;

//Equilibrium means elements in left and right are equal to the value in equilibrium point
//O(n)
//o/p: 2
public class EquilibriumPoint {
   public static void main(String[] args) {
      int[] arr = {1, 6, 7, 0, 7};
      int n = getEquilibriumPoint(arr);
      System.out.println(n);
   }

   private static int getEquilibriumPoint(int[] arr) {
      if (arr.length == 0) {
         return -1;
      }

      int sum = 0, sum_so_far = 0;

      for (int i = 0; i < arr.length; i++) {
         sum = sum + arr[i];
      }

      for (int i = 0; i < arr.length; i++) {
         sum = sum - arr[i];
         if (sum == sum_so_far) {
            return i;
         }
         sum_so_far = sum_so_far + arr[i];
      }
      return -1;
   }
}
