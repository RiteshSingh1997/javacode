package basicsjava;

public class NestedIfElse 
{

	public static void main(String[] args) 
	{
      int a = 30;
      int b = 40;
      int c = 20;
      if(a<b) // true
      {
    	  if(b<c) //false
    	  {
    		  System.out.println(1);
    	  }
    	  else
    	  {
    		  if(a==b) // false
    		  {
    			  System.out.println(2);
    		  }
    		  else
    		  {
    			  System.out.println(3);
    		  }
    	  }
      }
      else
	  {
		  System.out.println(4);
	  }

	}

}
