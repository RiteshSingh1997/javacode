package Collection_Interface;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Properties 
{

	public static void main(String[] args) 
	{
		Set s1 = new TreeSet();
		s1.add('B');
		s1.add('C');
		s1.add('D');
		s1.add('A');
		System.out.println(s1);
//	   Collections.sort(s1);                // sorting not applicable to set
//		s1.remove('A');                  // remove(object) method will remove the same value or object
//		System.out.println(s1);
	
		
		Iterator b1 = s1.iterator();
		while(b1.hasNext())
		{
			System.out.println(b1.next());
		}
			
	}

}
