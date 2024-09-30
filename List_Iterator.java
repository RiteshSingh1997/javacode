package Collection_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator 
{

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add(758);
		l1.add("Ritesh");
		l1.add(543);
		l1.add(null);
		
		ListIterator l2 = l1.listIterator();
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}

	}

}
