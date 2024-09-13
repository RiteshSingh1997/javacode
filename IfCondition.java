package basicsjava;

public class IfCondition 
{
   public static void main(String[] args) 
   {
	int a = 10;
	int b = 20;
	int c = 20;
	if(a<b)
	{	
		System.out.println("A is smaller than B");
	}
	if(a<b && b==c)
	{
		System.out.println("Condition Satisfied");
	}
   }
}
