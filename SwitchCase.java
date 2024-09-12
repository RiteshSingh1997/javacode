package basics;

import java.util.Scanner;

public class SwitchCase 
{   public static void main(String[] args) 

  {
	System.out.println("Press 1 for Chrome");
	System.out.println("Press 2 for firefox");
	System.out.println("Press 3 for Edge");
	System.out.println("Press 4 for Safari");
	System.out.println("Press 5 for IE");
	Scanner s1=new Scanner(System.in);
		int a=	s1.nextInt();//human input at run time
	switch(a)
	{
	case 1:
		System.out.println("Launch Chrome Browser");
		break;
	case 2:
		System.out.println("Launch firefox  Browser");
		break;
	case 3:
		System.out.println("Launch Edge Browser");
		break;
	case 4:
		System.out.println("Launch Safari Browser");
		break;
	case 5:
		System.out.println("Launch IE Browser");
		break;
	default:
		System.out.println("Sorry your selection is wrong,please check again");
		s1.close();
	}
  }	
}
