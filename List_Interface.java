package Collection_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add(758);
		l1.add("Ritesh");
		l1.add(543);
		l1.add(null);
	System.out.println(l1.size());
//	Collections.sort(l1);          to use for data of similar datatype that can be compare i.e homogenous  value
	
	   Iterator i1 = l1.iterator();
	   while(i1.hasNext())
	   {   
		   System.out.println(i1.next());
		   
	   }
	   

	}

}
