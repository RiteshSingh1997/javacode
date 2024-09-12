package basics;

import java.util.Arrays;

public class Reverse_Order_Array {

	public static void main(String[] args) 
	{
		int marks1[] = new int[5];
		marks1[0] = 2;
		marks1[1] = 4;
		marks1[2] = 6;
		marks1[3] = 8;
		marks1[4] = 10;
		
		int marks2[] = new int[5];	
		for(int i=0,k=4;i<marks1.length;i++)
		{
			marks2[k] = marks1[i];
			k--;
		}
		System.out.println(Arrays.toString(marks1));
		System.out.println(Arrays.toString(marks2));
	}

}
