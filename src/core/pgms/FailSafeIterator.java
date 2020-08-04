package core.pgms;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator
{
	public static void main(String args[])
	{
		CopyOnWriteArrayList ca = new CopyOnWriteArrayList();
		ca.add("1");
		ca.add("2");
		ca.add("3");
		ca.add("4");
		ca.add("5");
		int indexFlag=0;
		Iterator it = ca.iterator();
		while(it.hasNext())
		{
			indexFlag++;
			if(indexFlag==2)
			{
				ca.remove(indexFlag);
			}
			System.out.println(it.next());

		}


	}
}