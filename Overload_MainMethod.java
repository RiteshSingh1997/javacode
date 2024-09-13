package basicsjava;

public class Overload_MainMethod 
{   
	public static void main(int a, int b)
	{
		System.out.println("Addition of a and b is "+ a+b);
	}
	
	public static void main(float a, float b)
	{
		System.out.println("Substraction of a and b is "+ (a-b));
	}
	
	public static void main()
	{
	double a = 67.789;
	double b = 47.6382;
	System.out.println("Division of a and b is " + a/b);
	}

	public static void main(String[] args)           // heart main method
	{      
		
//		Overload_MainMethod N1 = new Overload_MainMethod();       // we can overload main method by static as well as non static methods
//		N1.main(30, 40);
//		N1.main(56.56f, 37.368f);
//		N1.main();
		main(20,40);
		main(46.567f, 47.764f);
		main();

	}

}
