package core;

public class GCTest
{ 
      
    // to store object name 
    String obj_name; 
      
    public GCTest(String obj_name)
    { 
        this.obj_name = obj_name; 
    } 
      
    static void show() 
    { 
        //object t1 inside method becomes unreachable when show() removed 
        GCTest t1 = new GCTest("t1");
        display(); 
          
    } 
    static void display() 
    { 
        //object t2 inside method becomes unreachable when display() removed 
        GCTest t2 = new GCTest("t2");
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
        // calling show() 
        show(); 
          
        // calling garbage collector 
        System.gc(); 
    } 
      
    @Override
    /* Overriding finalize method to check which object 
    is garbage collected */
    protected void finalize() throws Throwable  
    { 
        // will print name of object 
        System.out.println(this.obj_name + " successfully garbage collected"); 
    } 
} 