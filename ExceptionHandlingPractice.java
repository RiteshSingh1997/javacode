package basicsjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingPractice 
{

	public static void main(String[] args) 
	{
	  try
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of A and B");
		 float a = sc.nextFloat();
		 float b = sc.nextFloat();
		  if(a==b) 
		  {	 
		 System.out.println("A is equal to b");
		  }
	  }
	  catch(InputMismatchException a1)
      {
	   System.out.println("Please enter correct values of A and B");
	   Scanner sc = new Scanner(System.in);
	   float a = sc.nextFloat();
		 float b = sc.nextFloat();
      }
	  finally
	  {
		  System.out.println("Printing finally block keyword");
	  }
			
		
			 

	}

}
