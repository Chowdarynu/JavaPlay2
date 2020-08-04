package core.pgms;

public class SwapNumbers {
   public static void main(String[] args) {
      int a = 10, b = 5;
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
      System.out.println(a + ", " + b);
   }
}