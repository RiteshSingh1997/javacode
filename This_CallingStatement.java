package basics;

public class This_CallingStatement 
{  
	This_CallingStatement()
	{
		System.out.println("Constructor A");
	}
	This_CallingStatement(int a)
	{   this();
		System.out.println("Constructor B");
	}
	This_CallingStatement(int a, int b)
	{   this(38);
		System.out.println("Constructor C");
	}
	public static void main(String[] args) 
	{
		This_CallingStatement n1 = new This_CallingStatement(20,30);		
	}
}
