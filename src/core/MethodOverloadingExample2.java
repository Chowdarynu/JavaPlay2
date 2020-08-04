package core;

//Difference in the datatypes
class Overloading2
{
	public void disp(int val1,int val2)
	{
		int val=val1+val2;
		System.out.println("Inside First disp method, values is : "+val);
	}

	public void disp(Object val1,Object val2)
	{
		System.out.println("Inside second disp method, values are : "+val1+","+val2);
	}

	public void disp(String val1,String val2)
	{
		System.out.println("Inside Third disp method, values are : "+val1+","+val2);
	}
}
public class MethodOverloadingExample2
{
	public static void main (String args[])
	{
		Overloading2 oo = new Overloading2();
		
		oo.disp(1,2); //Calls the first disp method
		oo.disp("JavaInterview", "Point"); //Calls the second disp method
		oo.disp(null, null);
		Object o1=null;
		Object o2=null;
		oo.disp(o1, o2);
	}
}