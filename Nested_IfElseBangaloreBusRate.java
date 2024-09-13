package basicsjava;

public class Nested_IfElseBangaloreBusRate 
{
	
	public static void main(String [] args) 
	{
		
		char Gender1 = 'M';
		  int age = 61;
		       if(Gender1 == 'F')
		       {
		    	   if(age <2)
		    	   {
		    		   System.out.println("Free");
		    	   }
		    	   else
		    	   {
		    	    if(age>=2 && age<=12)
		    	    {
		    		   System.out.println("Half Ticket");
		    	    }
		    	    else
		    	   {
		            if(age>=13 && age<=60)
		    	    {
		    		   System.out.println("Full Ticket");
		    	    }
		    	   else
		    	   {
		    	    if(age>60)
		    	    {
		    	       System.out.println("Half Ticket");
		    	    }
		    	   }
		    	   }
		    	   }
		    	   	       
		        }
		        else
		        {
		    	   System.out.println("Free for Female");
		        }

	}
  }
