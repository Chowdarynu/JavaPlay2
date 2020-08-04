package core;

public class FinalExEmployee
{
    //example of blank final variable, where we will initialise in the constructor otherwise it will give compilation issues
    public final int SOCIAL_SECURITY_NUMBER;
    FinalExEmployee(int ssn)
    {
        SOCIAL_SECURITY_NUMBER = ssn;
    }
    public static void main(String args[])
    {
        FinalExEmployee e1 = new FinalExEmployee(1234);
        System.out.println("Social Security Number of Emploee e1 : "+e1.SOCIAL_SECURITY_NUMBER);
        FinalExEmployee e2 = new FinalExEmployee(5678);
        System.out.println("Social Security Number of Emploee e2 : "+e2.SOCIAL_SECURITY_NUMBER);
    }
}