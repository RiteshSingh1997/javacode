package Collection_Interface;

import java.util.ArrayList;
import java.util.List;

public class TwoList_EqualToEachother 
{

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add(789);                            // add method will just add one object
		l1.add(542);
		l1.add(998);
		
		List l2 = new ArrayList();
		l2.add(789);
		l2.add(542);
		l2.add(998);
		
		List l3 = new ArrayList();
		l3.add("Ritesh");
		l3.add(542);
		l3.add(null);
		
		boolean b1 = l2.equals(l1);
		System.out.println(b1);
		boolean b2 = l2.equals(l3);
		System.out.println(b2);

	}

}
