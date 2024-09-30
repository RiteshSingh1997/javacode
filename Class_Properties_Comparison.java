package Collection_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Class_Properties_Comparison 
{

	public static void main(String[] args) 
	{
//		ArrayList l1 = new Array/List();
		HashSet l1 = new HashSet();
//		LinkedHashSet l1 = new LinkedHashSet();
//		TreeSet l1 = new TreeSet();
//		Vector l1 = new Vector();
//		LinkedList l1 = new LinkedList();
//		Stack l1 = new Stack();
		l1.add(786);
		l1.add(68);
		l1.add(null);
		l1.add("Ritesh");
		l1.add(99);
//		Collections.sort(l1);                 // not applicable for set
		System.out.println(l1);
//		l1.remove(2);
//		System.out.println(l1);
		
		Iterator i1 = l1.iterator();
		   while(i1.hasNext())
		   {   
			   System.out.println(i1.next());
			   
		   }
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
