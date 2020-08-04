package core.sorting;

public class QuickSort {
   private static void quickSort(int[] arr, int low, int high) {
      int pivot = arr[(low + high) / 2];
      int i = low, j = high;

      while (i <= j) {
         while (arr[i] < pivot) {
            i++;
         }
         while (arr[j] > pivot) {
            j--;
         }
         if (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
         }

         if (low < j) {
            quickSort(arr, low, j);
         }
         if (high > i) {
            quickSort(arr, i, high);
         }
      }

   }

   private static void swap(int[] arr, int left, int right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
   }

   public static void main(String[] args) {
      int[] array = {3, 2, 5, 8, 4, 9, -4, 10};
      quickSort(array, 0, array.length - 1);
      System.out.println("After sorting...........");
      for (int a : array) {
         System.out.print(a);

      }
   }
}
