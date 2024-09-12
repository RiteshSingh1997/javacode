package basics;

public class Constructors 
{
  Constructors(int a, int b, int c)
  {
	  if(!(a<b && b<c))
	   System.out.println("Condition Satisfied");
  }
  Constructors(String a, String b)
  {
	  if(a==b)
	  {
		  System.out.println("Both Have Same Name");
	  }
	  else
	  {
		  System.out.println("Both Have different Name");
	  }
	
  }
  public static void main(String[] args)
  {
	  //new Constructors(2,3,4);
	  //new Constructors("Ritesh","Ritesh");
	  Constructors c1 = new Constructors(2,3,4);
	  Constructors c2 = new Constructors("Ritesh","Rohit");
  }
}
