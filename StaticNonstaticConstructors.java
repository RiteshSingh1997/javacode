package basics;

public class StaticNonstaticConstructors 
{
	static void Multiply(int a, int b)  //Static Method Parameterized
     {
		int Multiplication = a*b;
    	 System.out.println(Multiplication);
     }
     static void compare(int a, int b, int c)   //Static Method Parameterized
     {
    	 if(a==b || b==c) 
    	 System.out.println("Comparison Satisfied");
     }
     static void FullName(String Firstname, String lastname)    //Static Method  Parameterized
     {
    	 System.out.println("Ritesh Singh");
     }
     void Divide(int a, double b)   //NonStatic Method -Parameterized
     {
		 double Division = a/b;
    	 System.out.println(Division);
     }
     void Employee(int a, long b, String c)   //NonStatic Method -Parameterized
     {
    	 System.out.println("Employee Details");
     }
     void Comparison(int a, int b)   //NonStatic Method -Parameterized
     {
    	 if(a>b) 
    	 {
    		 System.out.println("A is greater than B");
         } 
    	 else
    	 {
    		 System.out.println("B is greater than A");
    	 }
    	 
     }
     StaticNonstaticConstructors(int a, int b) // constructor
     {
    	int Modulus= (a%b);
    	System.out.println(Modulus);
    	 
     }
     StaticNonstaticConstructors(float a, float b)  // constructor
     {
    	if (a!=b)
    	{
    	System.out.println("Differentvalue");
    	}
    	else
    	{
    		System.out.println("Same Value");
    	}
    	 
     }
     StaticNonstaticConstructors(double a, double b)  // constructor
     {
    	if(a==b);
    	System.out.println("Satisfied");
    	 
     }
     public static void main(String[] args) {                   // main method
    	 Multiply(25,27);                                       // Static Method Parameterized
    	 compare(12,12,50);                                     // Static Method Parameterized
    	 FullName("Ritesh","Singh");                            // Static Method Parameterized
 		StaticNonstaticConstructors M1 = new StaticNonstaticConstructors(2,8);
 		StaticNonstaticConstructors M2 = new StaticNonstaticConstructors(23.f,234.f);
 		StaticNonstaticConstructors M3 = new StaticNonstaticConstructors(578,789);
 		M1.Divide(20,400);                                // Non static Method Parameterized
 		M1.Employee(25,7021511364l,"Ritesh Singh");        // Non static Method Parameterized
 		M1.Comparison(5, 25);                              // Non static Method Parameterized
 		
	}
}
