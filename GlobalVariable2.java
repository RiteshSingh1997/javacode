package basicsjava;

public class GlobalVariable2 
{      static double PI = 3.14;
        int a=5;
        double b=6;
//        void Method1()
//        {   
//        	double PI = 3.53;
//        	System.out.println("Area of Circle is " + 2*PI*a);
//        }
//        
//        void Method2()
//        {
//        	System.out.println("Area of Rectangle is "+ 0.5*a*b);
//        }
//        
//        void Method3()
//        {
//        	System.out.println("Area of square is " + b*b);
//        }
//        
        public static void main(String[] args) 
        {
			
        	GlobalVariable2 N1 = new GlobalVariable2();
        	PI = 5.12;                                   // update value of Global variable
        	N1.a = 10;                                   // update value of Global variable
        	N1.b = 8;                                    // update value of Global variable
        	System.out.println(PI*N1.a*N1.b);
//        	N1.Method1();                            // calling non static method
//        	N1.Method2();                            // calling non static method
//        	N1.Method3();                            // calling non static method
        	
		}
     
}
