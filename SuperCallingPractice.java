package basicsjava;

class Method1                        // grand parent class
{     
	Method1()                         // constructor1
	{
		int a = 70;
        int b = 60;
        System.out.println("Addition of Method 1 is "+ a+b);
	}
}

class Method2  extends Method1                   // parent class
{
	Method2(int a, Float b)                   // constructor2
	{   super();
		System.out.println("Addition of Method 2 is "+ a+b);
	}
	
}

public class SuperCallingPractice extends Method2           // child class
{    
	SuperCallingPractice(String a)                             // constructor3
	{
		super(50,65.467f);
		System.out.println("No numeric Parameters to add");
	}

	public static void main(String[] args) 
	{
		SuperCallingPractice N1 = new SuperCallingPractice("Ritesh Singh");   // calling constructor by creating an object
	}

}
