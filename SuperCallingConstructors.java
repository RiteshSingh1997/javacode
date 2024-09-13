package basicsjava;

class ParentClass 
{
   ParentClass(String a, String b)
 {   
	System.out.println("Constructor with string datatype");
 }	
}

class ChildClass extends ParentClass
{     
  ChildClass(double c)
 {
   super("Ritesh","Singh");
   System.out.println("Child class constructor");	
 }	
}
public class SuperCallingConstructors extends ChildClass
{
	SuperCallingConstructors(int a)
	{   super(567.78);
		System.out.println("Constructor with para");
	}
	 public static void main(String[] args) 
	    {
		 SuperCallingConstructors n1=new SuperCallingConstructors(45);
	    }
}

