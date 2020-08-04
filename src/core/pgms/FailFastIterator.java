package core.pgms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator
{
	//It will throw ConcurrentModificationException
	public static void main(String args[])
	{
		List al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("5");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			al.remove(0);
			System.out.println(it.next());

		}

	}
}