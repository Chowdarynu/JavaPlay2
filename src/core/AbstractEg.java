package core;

abstract class AbstractEg {

	public static void main(String aa[])
	{
		System.out.println("Inside main method");
		disp();
	}
	abstract void disp1();

	public static void disp()
	{
		System.out.println("Abstract method called");

	}

}