package core.sorting;

public class SelectionSort {
   public static void main(String[] args) {
      int[] arr = {3, 2, 4, 9, 10, 44, 12};
      selectionSort(arr);
      for (int a : arr) {
         System.out.println(a);
      }
   }

   private static void selectionSort(int[] arr) {

      for (int i = 0; i < arr.length - 1; i++) {
         int minimum = i;
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minimum]) {
               minimum = j;
            }
         }
         int temp = arr[minimum];
         arr[minimum] = arr[i];
         arr[i] = temp;
      }
   }
}
