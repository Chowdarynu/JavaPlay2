package core.datastructures;

//For BS array should be sorted or else use Arrays.sort(arr) for sorting
public class BinarySearchExample {
   public static void binarySearch(int arr[], int first, int last, int key) {
      int mid = (last + first) / 2;
      while (first <= last) {
         if (arr[mid] < key) {
            first = mid + 1;
         } else if (arr[mid] > key) {
            last = mid - 1;
         } else {
            System.out.println("Element is found at index: " + mid);
            first = last + 1;
         }
         mid = (first + last) / 2;
      }
   }

   public static void main(String args[]) {
      int arr[] = {10, 10, 20, 30, 40, 50};
      int key = 40;
      int last = arr.length - 1;
      binarySearch(arr, 0, last, key);
   }
}