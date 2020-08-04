package core.pgms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailIterator
{
	public static void main(String args[])
	{
		List al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");

		System.out.println("List before Iteration "+al);
		int indexFlag=0;
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			it.next();
			indexFlag++;

			if(indexFlag==2)
			{
				it.remove();//to remove an element from the list use the remove() from Iterator
			}

		}
		System.out.println("List after Iteration"+al);
	}
}