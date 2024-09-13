package basicsjava;

public class Static_Nonstatic_Methods {

	static void add()
	{
	  int a = 30;
	  int b = 50;
	  int sum = a+b;
	  System.out.println(sum);
	}
	static void Ritesh()
	{
	  int a = 30;
	  int b = 50;
	  int c = 40;
	  if(a<b && b==c)
	  System.out.println("Condition satisfied");
	  else 
	  {
		  System.out.println("Condition not satisfied");
	  }
	}
    void sub(int c, int d)
    {
		 int sum = c*d;
		 System.out.println(sum);
		 
	}
    void employees(String EmployeeName, long PhoneNo, int age, int Employeeid)
    {
		 System.out.println("Registration Completed");
		 
	}
	
	public static void main(String[] args) 
	{
	  Static_Nonstatic_Methods n1 = new Static_Nonstatic_Methods();
	  add();
	  Ritesh();
	  n1.sub(2, 4);
	  n1.employees("Ritesh Singh", 7021511364l, 27, 8301);
    }

}
