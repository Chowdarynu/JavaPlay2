package core.datastructures.arrays;

public class CountOccurenceInSortedArray {
   public static void main(String[] args) {

      int[] arr = new int[]{1, 2, 3, 3, 3, 3, 5, 6, 15, 15};

      int target = 3;
      int res = usingLinearSearch(arr, target);
      System.out.println(res);
      res = usingBinarySearch(arr, target);
      System.out.println(res);

   }

   //O(log(n))
   private static int usingBinarySearch(int[] arr, int target) {
      int first = findFirstPosition(arr, target);
      int last = findLastPosition(arr, target);

      return (last - first) + 1;
   }

   private static int findFirstPosition(int[] arr, int target) {

      int index = -1;
      int start = 0;
      int end = arr.length - 1;

      while (start < end) {
         int mid = (start + end) / 2;

         if (arr[mid] == target) {
            index = mid;
            end = mid - 1;
         } else if (arr[mid] > target) {
            end = end - 1;
         } else {
            start = start + 1;
         }
      }
      return index;

   }

   private static int findLastPosition(int[] arr, int target) {
      int index = -1;
      int start = 0;
      int end = arr.length - 1;

      while (start < end) {
         int mid = (start + end) / 2;
         if (arr[mid] == target) {
            index = mid;
            start = start + 1;
         } else if (arr[mid] > target) {
            end = end - 1;
         } else {
            start = start + 1;
         }
      }
      return index;

   }

   //TIme complexity: O(n)
   private static int usingLinearSearch(int[] arr, int target) {
      int count = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == target) {
            count++;
         }
      }
      return count;
   }
}
