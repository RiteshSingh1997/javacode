package basicsjava;

public class MultiLevel3 extends MultiLevel2
{ 
	static void Kids()
	{
		int age = 5;
		if(age>=5 && age<10)
		{
			System.out.println("Free Dinner for kids");
		}
	}

	public static void main(String[] args) 
	{
		MultiLevel3 m1 = new MultiLevel3();
		Husband();
		m1.Wife();
		Kids();		
	}

}
