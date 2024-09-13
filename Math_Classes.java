package basicsjava;

import java.util.Scanner;

public class Math_Classes 
{
  public static void main(String[] args) 
  {
	 System.out.println("Enter value of X and Y");
	 Scanner sc = new Scanner(System.in);
	 int x = sc.nextInt();
	 int y = sc.nextInt();
	 System.out.println("Addition of x and y is " + Math.addExact(x, y));
	 try 
	 {
		Thread.sleep(2000);
	 } catch (InterruptedException e) 
	 {
		
		e.printStackTrace();
	 }
	 System.out.println("Enter value of C and D");
	 int c = sc.nextInt();
	 int d = sc.nextInt();
	 System.out.println("Substraction of x and y is " + Math.subtractExact(c, d));
	 try 
	 {
		Thread.sleep(3000);
	 } catch (InterruptedException e) 
	 {
		
		e.printStackTrace();
	 }
	 System.out.println("Enter value of A and B");
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 System.out.println("Max number from x and y is " + Math.max(a, b));
	 try
	 {
			Thread.sleep(3000);
		 } catch (InterruptedException e) 
		 {
			
			e.printStackTrace();
		 }
	 System.out.println("Enter value of E and F");
	 int e = sc.nextInt();
	 int f = sc.nextInt();
	 System.out.println("Min number from x and y is " + Math.min(e, f));
	 System.out.println("Enter value of G and H");
	 float g = sc.nextFloat();
	 float h = sc.nextFloat();
	 System.out.println("Min number from x and y is " + Math.min(g, h));
  }
	
	
}
