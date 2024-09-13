package basicsjava;

public class Math_Random 
{     static  double PI = Math.PI;
	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++)
		{
			double r = Math.random();
			System.out.println("Area of circle is " + PI*r*r);
		}
       
	}

}
