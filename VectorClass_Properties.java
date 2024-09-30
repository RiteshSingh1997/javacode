package Collection_Interface;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass_Properties 
{

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(1200);
		v1.add("Ritesh");
		v1.add('A');
		v1.add(null);
		System.out.println(v1);
//		Collections.sort(v1);
////		System.out.println(v1);
//		a1.remove(1);                        // remove(indexat) method will remove the value at that index
//		System.out.println(v1);
		
		Iterator b1 = v1.iterator();
		while(b1.hasNext())
		{
			System.out.println(b1.next());
		}
		ListIterator b2 = v1.listIterator();
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
