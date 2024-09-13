package basicsjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling 
{

	public static void main(String[] args) 
	{
		try 
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");   
		int num = sc.nextInt();                //InputMismatchException if user enters wrong input
		int a =1/0;                             //ArithmeticException
		System.out.println(a);
//		Scanner s2 = new Scanner(System.in);
//		System.out.println("Enter the age in decimal");    //InputMismatchException if user enters wrong input
//		String b = s2.next();
//		s2.close();
		}
		catch(InputMismatchException A1)                            
		{
			System.out.println("Its seems like you are entering wrong age");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Please Enter the age again");
			int num = s1.nextInt();
			s1.close();
		}
		catch(ArithmeticException A2)                            
		{
			System.out.println("Sorry there was a blocker but we handle it");
		}
		finally {
			if(1==1)
			{
				System.out.println("Condition Satisfied");
			}
		}
	}

}
