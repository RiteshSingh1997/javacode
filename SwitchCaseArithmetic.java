package basicsjava;

public class SwitchCaseArithmetic 
{          int a = 30;
           int b = 40;
    public static void main(String[] args) 
    {
    	System.out.println("Press 1 for addition");
    	System.out.println("Press 2 for Substraction");
    	System.out.println("Press 3 for Multiplication");
    	System.out.println("Press 4 for Division");
    	SwitchCaseArithmetic a1= new SwitchCaseArithmetic();
      switch(4)
      {
      case 1:
    	  System.out.println(a1.a+a1.b);
    	  break;
      case 2:
    	  System.out.println(a1.a-a1.b);
    	  break;
      case 3:
    	  System.out.println(a1.a*a1.b);
//    	  break;
      case 4:
    	  System.out.println(a1.a/a1.b);
//    	  break;
    	default:
    		System.out.println("Sorry input is wrong");
	   } 
    }   
}
