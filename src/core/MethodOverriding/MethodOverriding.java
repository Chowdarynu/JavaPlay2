package core.MethodOverriding;

class Parent1
{
    public void display(String name)
    {
        System.out.println("Welcome to Parent Class \""+name+"\"");
    }
}
public class MethodOverriding extends Parent1
{
    //private is more restrictive, so it should be public
    public void display(String name)
    {
        System.out.println("Welcome to Child class \""+name+"\"");
    }
    public static void main(String args[])
    {
        //Create object for Child class
        MethodOverriding c = new MethodOverriding();
        c.display("JIP");
        
        //Create object for Parent class will work here
        Parent1 p = new Parent1();
        p.display("JIP");
     }
}

    /*Exception Handling in Overriding
    Below are the rules which has to be followed when go for Method Overriding with Exception Handling.

        When Parent class method doesn’t throw any Exception then Child class overriden method also cannot declare any Checked Exception (Compile time Exception).
        When Parent class method doesn’t throw any exception then Child class overriden method can declare UnChecked Exception (Runtime Exception).
        When Parent class declares an Exception then the Child class overriden method can declare the same or sub class exception or no exception.
        When Parent class declares an Exception then the Child class overriden method  cannot declare super class exception*/