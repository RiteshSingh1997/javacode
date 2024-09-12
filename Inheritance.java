package basics;

class First           // Parent class
{
	static void Method1() 
	{
		
		System.out.println("Add");
	}
	void Method2()
	{
		System.out.println("Sub");
	}
	
}
class Inheritance extends First     // child class
{   static void Method3(int a, int b)
	{
	System.out.println("Multiply");
	}
	public static void main(String[] args) 
	{
		Method1();
		Inheritance N1 = new Inheritance();
		N1.Method2();
		N1.Method3(10, 70);
	}
}


