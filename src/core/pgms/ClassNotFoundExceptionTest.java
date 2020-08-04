package core.pgms;

public class ClassNotFoundExceptionTest
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) 
        {
            System.out.println("MySQL Driver Missing!!!");
            e.printStackTrace();
            return;
        }
    }
}

//This will throw java.lang.ClassNotFoundException: com.mysql.jdbc.Driver as the jdbc driver is not available in the classpath