package core.datastructures;

public class CustomStack {
   public static void main(String[] args) {
      Stack stack = new Stack(3);

      stack.push(1);
      stack.push(2);

      stack.pop();
      stack.pop();

      stack.push(3);

      System.out.println("Top element is: " + stack.peek());
      System.out.println("Stack size is " + stack.size());

      stack.pop();

      // check if stack is empty
      if (stack.isEmpty()) {
         System.out.println("Stack Is Empty");
      } else {
         System.out.println("Stack Is Not Empty");
      }
   }
}

class Stack {
   int[] arr;

   int top;

   int capacity;

   public Stack(int size) {
      this.arr = new int[size];
      this.top = -1;
      this.capacity = size;
   }

   public void push(int item) {
      if (isFull()) {
         throw new RuntimeException("Stack is full");
      }
      arr[++top] = item;
   }

   public int pop() {
      if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
      }

      return arr[top--];
   }

   public int peek() {
      if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
      }
      return arr[top];
   }

   public boolean isEmpty() {
      return top == -1;
   }

   public boolean isFull() {
      return top == capacity - 1;
   }

   public int size() {
      return top + 1;
   }


}