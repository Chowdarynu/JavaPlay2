package core.innerclasses;


/**
 * Created by chowdan on 30-08-2018.
 */
public class InnerOuterClassDemo {

   public static void main(String[] args) {
      Outer obj = new Outer();
      Outer.Inner i =  obj.new Inner();//Inner class
      //Outer.Inner i = Outer.Inner();//static inner class
      i.display();
   }
}

class Outer{
   //static inner class
   class Inner{//Inner class
      void display(){
         System.out.println("Inside inner class..");
      }
   }
}
