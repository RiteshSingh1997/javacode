package Collection_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Properties 
{

	public static void main(String[] args) 
	{
		Set s1 = new LinkedHashSet();
		s1.add('B');
		s1.add("Ritesh");
		s1.add(null);
		s1.add('A');
		System.out.println(s1);
//	   Collections.sort(s1);                // sorting not applicable to set
		s1.remove('A');                  // remove(object) method will remove the same value or object
		System.out.println(s1);
	
		Iterator b1 = s1.iterator();
		while(b1.hasNext())
		{
			System.out.println(b1.next());
		}
			
	}

}
