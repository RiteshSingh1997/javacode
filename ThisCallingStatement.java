package basicsjava;

public class ThisCallingStatement 
{
	ThisCallingStatement()                     //constructor1
	{
		char A = 'Z';
		System.out.println(A);
	}
	
	ThisCallingStatement(int a, int b, int c)            //constructor2
	{   this();
		if(a<b && b<c)
		System.out.println("AND Condition Satisfied");
	}
	
	ThisCallingStatement(float a, double b)             //constructor3
	{   this(60,78,80);
		if(a>b || b>a)
		{
			System.out.println("OR Condition Satisfied");
		}
	}
	
public static void main(String[] args) 
    {
	 new ThisCallingStatement(67.65f,67.32);

	}

}
