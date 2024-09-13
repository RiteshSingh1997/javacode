package basicsjava;

import java.util.Scanner;

public class SwitchCase 
{
  public static void main(String[] args) 
  {
	  System.out.println("Press 1 for Google Chrome");
	  System.out.println("Press 2 for Firefox");
	  System.out.println("Press 3 for Edge");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();	
	switch(b)
	{
	case 1:
		System.out.println("Launch Chrome Browser");
		break;
	case 2:
		System.out.println("Launch Firefox Browser");
        break;
	case 3:
		System.out.println("Launch Edge Browser");
		break;
	default:
			 System.out.println("Sorry your selection is wrong");
			 sc.close();
	}
 }
}
