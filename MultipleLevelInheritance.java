package basicsjava;

interface Grandparent
{
   void N1();
   void N2();
			
}

interface Parent extends Grandparent
{
	 void M1();
	 void M2();
	 void M3();
	
}

public class MultipleLevelInheritance implements Parent       // Relation between class interface and interface
{
	public void M1() 
	{
		System.out.println(3);
		
	}

	public void M2() 
	{
		System.out.println(4);
		
	}

	public void M3() 
	{
		System.out.println(5);
		
	}

	public void N1() 
	{
		System.out.println(1);
		
	}

	public void N2() 
	{
		System.out.println(2);
		
	}
	public static void main(String[] args) 
	{
		MultipleLevelInheritance n1 = new MultipleLevelInheritance();
		n1.N1();
		n1.N2();
		n1.M1();
		n1.M2();
		n1.M3();

	}

}
