package basicsjava;

class Division
{  
	void Print(int a, int b)
	{
		System.out.println("Division is " +a/b);
	}

}

class Addition extends Division
{
	void Print(int a, int b)
	{   
		super.Print(4, 2);
		System.out.println("Addition is " +a+b);
	}
	
}
public class MethodOverriding extends Addition
{   
	void Print(int a, int b)
	{  
	    super.Print(20, 20);
		System.out.println("Substraction is " +(a-b));
	}

	public static void main(String[] args) 
	{  
	
		MethodOverriding n1 = new MethodOverriding();
		n1.Print(40, 20);

	}

}
