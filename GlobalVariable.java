package basicsjava;

public class GlobalVariable 
{  
	int length = 60;                                        // Global Variable
	 static double PI = 3.14;                                      // Global Variable
	void AreaOfRectangle1()                               // Non Static Non Parameterized
	{
		double width = 655.3;
		//double AreaOfRectangle = length*width;
		System.out.println("AreaOfRectangle is " + length*width);
	}
	void AreaOfRectangle2()                               // Non Static Non Parameterized
	{
		double width = 689.3;
		//double AreaOfRectangle = length*width;
		System.out.println("AreaOfRectangle is " + length*width);
	}
	  void AreaOfCircle1()                            // Static Non Parameterized
	{
		int r = 7;
		double AreaOfCircle = PI*r*r;
		System.out.println(AreaOfCircle);
	}
	public static void main(String[] args) {
		GlobalVariable N1 = new GlobalVariable();
		N1.AreaOfRectangle1();
		N1.AreaOfRectangle2();
		N1.AreaOfCircle1();
		System.out.println(PI);       // by using static global variable we can call that variable by its name without creating an object
	}

}
