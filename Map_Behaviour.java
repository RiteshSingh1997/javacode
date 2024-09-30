package Collection_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_Behaviour 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("ritesh", 7);
		m1.put("sonali", 6);
		m1.put("anita", 1);
		m1.put("narendra", 8);
		System.out.println(m1);
		
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		m2.put("ritesh", 7);
		m2.put("sonali", 6);
		m2.put("anita", 1);
		m2.put("narendra", 8);
		System.out.println(m2);
	boolean b1 = m2.equals(m1);
	System.out.println(b1);		

	}

}
