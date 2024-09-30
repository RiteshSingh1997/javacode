package Collection_Interface;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackClass_Properties 
{

	public static void main(String[] args) 
	{
		Stack s1 = new Stack();
		s1.add(1200);
		s1.add("Ritesh");
		s1.add('A');
		s1.add(null);
		System.out.println(s1);
//////		Collections.sort(s1);
////		System.out.println(s1);
//		a1.remove(1);                        // remove(indexat) method will remove the value at that index
//		System.out.println(a1);
		
		Iterator b1 = s1.iterator();
		while(b1.hasNext())
		{
			System.out.println(b1.next());
		}
		ListIterator b2 = s1.listIterator();
		while(b2.hasNext()) 
		{
			System.out.println(b2.next());        // for printing in forward direction
		}
		while(b2.hasPrevious())
		{
			System.out.println(b2.previous());       // for printing in reverse direction
		}
	}

}
