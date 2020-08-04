package core.pgms;

public class MissingNumberInArray {
   static int sumOfNnumbers(int n) {
      int sum = (n * (n + 1)) / 2;

      return sum;
   }

   static int sumOfElements(int[] array) {
      int sum = 0;

      for (int i = 0; i < array.length; i++) {
         sum = sum + array[i];
      }
      return sum;
   }

   public static void main(String[] args) {
      int n = 8;
      int[] a = {1, 2, 5, 3, 7, 8, 6};
      int sumOfNnumbers = sumOfNnumbers(n);
      int sumOfElements = sumOfElements(a);
      int missingNumber = sumOfNnumbers - sumOfElements;

      System.out.println("Missing Number is = " + missingNumber);
      int ret = missingNumberUsingXOR(a);
      System.out.println("Missing Number using XOR is = " + ret);
   }

   private static int missingNumberUsingXOR(int[] a) {
      int xor = 0;
      int n = a.length;

      // take xor of all array elements
      for (int i : a) {
         xor ^= i;
      }

      // take xor of numbers from 1 to n+1
      for (int i = 1; i <= n + 1; i++) {
         xor ^= i;
      }

      // same elements will cancel out each other as a ^ a = 0
      // Also 0 ^ 0 = 0 and a ^ 0 = a

      // xor will contain the missing number
      return xor;


   }
}
