package core;

//Difference in the parameters
class Overloading
{
	public void disp()
	{
		System.out.println("Inside First disp method");
	}

	public void disp(String val)
	{
		System.out.println("Inside Second disp method, value is: "+val);
	}

	public void disp(String val1,String val2)
	{
		System.out.println("Inside Third disp method, values are : "+val1+","+val2);
	}
}
public class MethodOverloadingExample1
{
	public static void main (String args[])
	{
		Overloading oo = new Overloading();
		oo.disp(); //Calls the first disp method
		oo.disp("Java Interview"); //Calls the second disp method
		oo.disp("JavaInterview", "Point"); //Calls the third disp method
	}

}