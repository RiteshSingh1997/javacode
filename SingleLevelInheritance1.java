package basicsjava;

public class SingleLevelInheritance1 extends SingleLevelInheritance   // child class
{
	void Comparison2()
 {
	int a = 70;
	int b =90;
	{
		System.out.println("Addition of A and B is " + (a+b));
	}
 }

	public static void main(String[] args) 
	{
		SingleLevelInheritance1 n1 = new SingleLevelInheritance1();
		n1.Comparison1(20, 10);
		n1.Comparison2();     
	}

}
