package basicsjava;

class First1
{
	
	static void Parent()
	{
		int a = 78;
		float b = 43.324f;
		double c = 3432.322;
		if(a>b && c>b)
		{
			System.out.println("Condition satisfied");
		}
		else
		{
			System.out.println("Not satisfied");
		}
		
	}	
}

abstract public class AbstractClass extends First1        // relation between abstract class and class
{     
	static void Teachers()                               // concrete method
	{
		System.out.println("Teachers will start class from September 1");
	}

	public static void main(String[] args) 
	{
	  Parent();
	  Teachers();
	}

}
