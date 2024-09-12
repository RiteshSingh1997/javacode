package basics;

public class Math_Class 
{      double PI= Math.PI;
    //  double radius = Math.random();
   public static void main(String[] args) 
   { 
	   Math_Class n1 = new Math_Class();    //object with referance variable
 //  System.out.println(n1.radius);
 //	 System.out.println(n1.PI*n1.radius*n1.radius);
	 for(int i=1;i<=10;i++)
	 {
		 double radius = Math.random();
		 System.out.println(n1.PI*radius*radius);
		 
	 }
   }
}
