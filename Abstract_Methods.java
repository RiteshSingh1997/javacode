package basicsjava;

abstract class MethodLogin
{
	abstract void Method_Login();
	  abstract void Method_Registration();		
}

public class Abstract_Methods extends MethodLogin            // Relation between class and abstract class
{
void Method_Login() 
{
	System.out.println("Enter Username");
	System.out.println("Enter Password");
}

void Method_Registration() 
{
  System.out.println("Enter all the required details");
	
}
public static void main(String[] args) 
{
	Abstract_Methods n1 = new Abstract_Methods();
	n1.Method_Login();
	n1.Method_Registration();

}

}
