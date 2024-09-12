package basics;
class two
{
     two(float b)                     // Method with para
     {
    	 System.out.println("Head of the constructor");
     }	
}

class one extends two
{   
	one()                         // Method with non para
	{ super(67.878f);
	System.out.println("First Constructor");
	}
}

public class SuperCallingCons extends one

{
	SuperCallingCons(int a, int b)        // Method with Para
	{   super();
		System.out.println("Second Constructor");
	}
	public static void main(String[] args) 
	{   
		SuperCallingCons n1 = new SuperCallingCons(20,30);
	
	}
}
