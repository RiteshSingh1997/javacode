package Collection_Interface;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface 
{

	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		
		s1.add(834);
		s1.add("Ritesh");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
//	   Collections.sort(s1);                  // sorting not applicable to set
//		s1.remove("Ritesh");                  // remove(object) method will remove the same value or object
//		System.out.println(s1);
		
		Iterator b1 = s1.iterator();
		while(b1.hasNext())
		{
			System.out.println(b1.next());
		}
		
	}
	
}


