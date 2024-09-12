package basics;

class Parents extends Teacher     // Parent class
{
	void Marks()
	{
		System.out.println("Pass");
	}
}

public class Student extends Parents   // child class
{  
	static void Multiply()
	{
		System.out.println("C");
	}

	public static void main(String[] args) 
	{
		Add();
		Student s1 = new Student();
		s1.Sub();
		Multiply();
		s1.Marks();

	}

}
