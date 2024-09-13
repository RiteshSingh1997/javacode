package basicsjava;

import java.util.Scanner;

public class AllAreasByGivingInput 
{
	static double PI = 3.14;
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius");
	double Radius = sc.nextDouble();
	System.out.println("Area of Circle is " + PI*Radius*Radius);   // Area of Circle
	System.out.println("Enter length of Rectangle");
	double length = sc.nextDouble();
	System.out.println("Enter width of Rectangle");
	double width = sc.nextDouble();
	System.out.println("Area of Rectangle is " + length*width);    // Area of Rectangle
	System.out.println("Enter side of square");
	int side = sc.nextInt();
	System.out.println("Area of Square is " + side*side);           // Area of Square
	System.out.println("Enter height of Traingle");
	double height = sc.nextDouble();
	System.out.println("Enter base of Traingle");
	double base = sc.nextDouble();
	System.out.println("Area of Traingle is " + 0.5*height*base);     // Area of Traingle
	System.out.println("Enter base1 for Trapezium");
	long base1 = sc.nextLong();
	System.out.println("Enter base2 for Trapezium");
	long base2 = sc.nextLong();
	System.out.println("Enter height for Trapezium");
	double height1 = sc.nextDouble();
	System.out.println("Area of Trapezium is " + 0.5*(base1+base2)*height1);     // Area of Trapezium
	System.out.println("Enter radius of circle");
	double radius = sc.nextDouble();
	System.out.println("Circumference of circle is " + 2*PI*radius);   //Circumference of circle
	System.out.println("Enter the length of Rectangle");
	double length1 = sc.nextDouble();
	System.out.println("Enter the Width of Rectangle");
	double width2 = sc.nextDouble();
	System.out.println("Perimeter of Reactangle is "+ 2*(length1+width2));    //Perimeter of Rectangle
	System.out.println("Enter the length of Square");
	double side2 = sc.nextDouble();                             
	System.out.println("CircUmference of Square is " + 4*side2);  //Circumference of Square
	sc.close();
		
	}
}
