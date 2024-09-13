package basicsjava;

public class This_KeyWord 
{    static double PI = Math.PI;
     String Name = "Ritesh Singh";
     float salary = 40000.00f;

		 void Employee(double PI, String Name, float salary)
		{
			System.out.println("Printing Employee Details");
			this.PI = PI;
			this.Name = Name;
			this.salary = salary;
		}
          public static void main(String[] args) 
        {
        	  This_KeyWord n1 = new This_KeyWord();
        	  n1.Employee(3.25, "Sonali Singh", 78000.0f);
        	  System.out.println(PI);
        	  System.out.println(n1.Name);
        	  System.out.println(n1.salary);
        	  
		}

}
