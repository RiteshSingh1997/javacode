package basicsjava;

public class MultiLevel1 
{
  
	static void Husband()
	{
		int age = 10;
	  char  Gender= 'M';
				if(Gender=='F')
	    {
			System.out.println("Free Dinner for All Female");
		}
				else if(age>=10 && age<=50)
				{
					System.out.println("Free for Male");
				}
				else if(age>51 && age<=100)
				{
					System.out.println("Half Price for Male");
				}
				
	}
	
}
