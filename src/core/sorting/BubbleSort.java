package core.sorting;

public class BubbleSort {
   public static void main(String[] args) {
      int[] arr = {3, 2, 4, 9, 10, 44, 12};
      bubbleSort(arr);
      for (int a : arr) {
         System.out.println(a);
      }
   }

   private static void bubbleSort(int[] arr) {
      int temp;

      for (int i = arr.length - 1; i > 1; i--) {
         for (int j = 0; j < i; j++) {
            if (arr[j] > arr[j+1]) {
               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }
   }
}
