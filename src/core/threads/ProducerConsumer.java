package core.threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
   public static void main(String[] args) {
      List<Integer> sharedQueue = new ArrayList<Integer>();
      Producer producer = new Producer(sharedQueue);
      Consumer consumer = new Consumer(sharedQueue);
      Thread p = new Thread(producer, "Producer Thread");
      Thread c = new Thread(consumer, "Consumer Thread");
      p.start();
      c.start();
   }
}

class Producer implements Runnable {
   List<Integer> sharedQueue;

   private int maxSize = 1;

   public Producer(List<Integer> sharedQueue) {
      this.sharedQueue = sharedQueue;
   }

   public void run() {
      for (int i = 1; i <= 10; i++) {
         try {
            produce(i);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }

   private void produce(int i) throws InterruptedException {
      synchronized (sharedQueue) {
         if (sharedQueue.size() == maxSize) {
            System.out.println("Queue is full");
            sharedQueue.wait();
         }
      }
      synchronized (sharedQueue) {
         System.out.println("Produced : " + i);
         sharedQueue.add(i);
         Thread.sleep(1000);
         sharedQueue.notify();
      }
   }
}

class Consumer implements Runnable {
   List<Integer> sharedQueue;

   public Consumer(List<Integer> sharedQueue) {
      this.sharedQueue = sharedQueue;
   }

   @Override
   public void run() {
      while (true) {
         try {
            consume();
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }

   private void consume() throws InterruptedException {
      synchronized (sharedQueue) {
         while (sharedQueue.size() == 0) {
            System.out.println("Queue is empty");
            sharedQueue.wait();
         }
      }
      synchronized (sharedQueue) {
         Thread.sleep(1000);
         System.out.println("Consumed :" + sharedQueue.remove(0));
         sharedQueue.notify();
      }
   }
}