package basics;

class GrandParents
{    
	void Parents(int a)
	{
		System.out.println("A");
	}	
}

class Overriding_Parent extends GrandParents
{    void Parents(int a)
	{  super.Parents(40);                         //super keyword
	  System.out.println("B");
	}	
}
public class Method_Overriding extends Overriding_Parent
{
   void Parents(int a)
   {  
	  System.out.println("C"); 
	  super.Parents(30);                           //super keyword
   }
   public static void main(String[] args) 
   {
	   Method_Overriding n1 = new Method_Overriding();
	   n1.Parents(20);
   }
}
