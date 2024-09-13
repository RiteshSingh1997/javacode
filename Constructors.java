package basicsjava;

public class Constructors 
{
   Constructors()              // non parameterized
  {
	  int a = 50;
	  int b = 60;
	  System.out.println(a*b);
  }
	Constructors(int a,int b,int c)           // parameterized
  {
	  if(a!=b && b==c)
		  System.out.println("First Condition Satisfied");
  }
  Constructors(int a, int b)                  // parameterized
  {
	  if(a<b)
	  {
		  System.out.println("Second Condition Satisfied");
	  }
  }
	 
  public static void main(String[] args) 
  {
	Constructors C1= new Constructors(20,30,30);
	Constructors C2= new Constructors(20,30);
	Constructors C3 = new Constructors();
  }
}
