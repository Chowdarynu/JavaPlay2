package core;
//difference in the sequence of parameters
class Overloading3
{
	public void disp(int val1,String val2)
	{
		//int val= Integer.parseInt(val1+val2);It will give number format exception
		System.out.println("Inside First disp method, values are : "+val1+","+val2);
	}

	public void disp(String val1,int val2)
	{
		System.out.println("Inside Third disp method, values are : "+val1+","+val2);
	}
}
public class MethodOverloadingExample3
{
	public static void main (String args[])
	{
		Overloading3 oo = new Overloading3();
		
		oo.disp(456,"JavaInterviewPoint"); //Calls the first disp method
		oo.disp("JavaInterviewPoint",123); //Calls the second disp method
	}
}