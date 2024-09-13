package basicsjava;

public class LocalVariable 
{
   static void Variable1()               // Static Method
  {
	  int a = 5;                        // Local Variable
	  int b = 6;
	  System.out.println(a*b);
  }
  void Variable2(long a, long b)          // Non Static Method
  {
	  a = 54332;                         // Local Variable
	  b = 46483;                         // Local Variable
	  if(a>b)
	  {
		  System.out.println("A is greater than B so printing value of A = " +a);
	  }
  }
	  void Variable3(int a, int b)        // Non Static Method
	  {
		  a = 90;                         // Local Variable
		  b = 100;                        // Local Variable
		  {
			  System.out.println("A divide B is " +a%b);
		  }
	  }
  public static void main(String[] args) {
	Variable1();
	LocalVariable A1 = new LocalVariable();
	A1.Variable2(0,0);
	A1.Variable3(0, 0);
	
}
  
}
