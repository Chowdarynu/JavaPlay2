package core.threads;

public class EvenOddPrinter {
   static boolean isOdd = true;

   public static void main(String[] args) {
      Runnable odd = () -> {
         for (int i = 1; i <= 10; ) {
            if (isOdd) {
               System.out.println(Thread.currentThread().getName() + " " + i);
               i += 2;
               isOdd = false;
            }
         }
      };

      Runnable even = () -> {
         for (int i = 2; i <= 10;) {
            if (!isOdd) {
               System.out.println(Thread.currentThread().getName() + " " + i);
               i += 2;
               isOdd = true;
            }
         }
      };

      Thread t1 = new Thread(odd, "Odd");
      Thread t2 = new Thread(even, "Even");
      t1.start();
      t2.start();
   }
}