package basicsjava;
 
class First
{
	void Comparison1(int a, int b)
	{
		if(a!=b)
		{
			System.out.println("First Condition Satisfied");
	    }	
	}
}

class Second extends First
{
	void Comparison2()
	{
		double a = 56.006;
		float b = 3.167f;
		float c = 7.868f;
		if(a>b && c>b)
		{
			System.out.println("Second Condition Satisfied");
		}
	}
}
		
public class MultiLevelInheritance extends Second
{
	void Comparison3()
	{
		double a = 78.006;
		float b = 46.167f;
		float c = 87.868f;
		if(a>b || c>b)
		{
			System.out.println("Third Condition Satisfied");
		}
	}

	public static void main(String[] args) 
	{
		MultiLevelInheritance n1 = new MultiLevelInheritance();
		n1.Comparison1(20, 30);
		n1.Comparison2();
		n1.Comparison3();
    }

	
 }

