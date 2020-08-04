package core.MethodOverriding;

import java.io.IOException;

class Parent
{
    public void display()
    {
        System.out.println("Welcome to Parent Class");
    }
}
public class Child extends Parent
{
    // throws IOException will give compilation error , cannot throw checked exception as parent is not throwing
    //Can throw  ArrayIndexOutOfBoundsException(Unchecked exception)
    public void display()
    {
        System.out.println("Welcome to Child class");
    }
    public static void main(String args[]) throws IOException
    {
        //Create object for Child class
        Child c = new Child();
        c.display();
        
        //Create object for Parent class
        Parent p = new Parent();
        p.display();
     }
}

//THis is fine
//public void display() throws Exception
//    {
//        System.out.println("Welcome to Parent Class");
//    }
//}
//public class Child extends Parent
//{
//    public void display() throws ArrayIndexOutOfBoundsException
//    {
//        System.out.println("Welcome to Child class");
//    }