package core.pgms;

class Test1
{
     public void disp()
     {
         System.out.println("disp method called");
     }
}
 
public class NoClassDefFoundError
{
    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.disp();
    }
}
//If the class Test1 is presents at compile time and while runtime it is not existing it will throw NoClassDefFoundError error