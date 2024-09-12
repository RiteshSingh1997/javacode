package basics;

public class NestedIfElse 
{

public static void main(String[] args) 
{
	 int a = 21;
	 char gender = 'M';
	 char gender1='F';
	 if(gender=='M')
	 {
	  if(a<=20)
	  {
		 System.out.println("Half Ticket");
	  }
	  else if(a<=21 && a<=60)
	  {
		 System.out.println("Full Ticket"); 
	  }
	  else if(a>61 && a<=100)
	  {
		 System.out.println("Half Ticket");
	  }
	 
	 else
	  {
		 System.out.println("Free for Female");
	  }
	 }
	
}
}
