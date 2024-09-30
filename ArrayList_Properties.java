package Collection_Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList_Properties 

{

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(1200);
		a1.add("Ritesh");
		a1.add('A');
		a1.add(null);
//		System.out.println(a1);
//////		Collections.sort(a1);
////		System.out.println(a1);
		a1.remove(1);                             // remove(indexAt) method will remove the value at that index
		a1.remove(null);                        // remove(object) method will remove the same value or object 
		System.out.println(a1);
		
//		Iterator b1 = a1.iterator();
//		while(b1.hasNext())
//		{
//			System.out.println(b1.next());
//		}
		ListIterator b2 = a1.listIterator();
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
