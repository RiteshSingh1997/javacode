package Collection_Interface;

import java.util.ArrayList;
import java.util.List;

public class List_Methods 
{

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add(789);                            // add method will just add one object
		l1.add(542);
		l1.add(998);
		l1.add(232);
		
		List l2 = new ArrayList();
		l2.add(790);
		l2.add(null);
		l2.add(879);
		l2.addAll(l1);                           // addAll method add entire collection
		System.out.println(l2);
		
		l2.remove(2);                          // remove index value
		System.out.println(l2);
		l2.remove(null);                      // remove object removes char,String, boolean values, null values.
		System.out.println(l2);
		l2.removeAll(l1);                      // removeAll removes whole collection
		System.out.println(l2);
		l2.clear();
		System.out.println(l2);
		
		boolean b1 = l2.isEmpty();
		System.out.println(b1);
		
	}

}
