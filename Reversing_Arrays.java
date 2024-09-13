package basicsjava;

import java.util.Arrays;

public class Reversing_Arrays 
{

	public static void main(String[] args) 
	{
		int marks1[] = new int[4];
		   marks1[0] = 67;
		   marks1[1] = 90;
		   marks1[2] = 45;
		   marks1[3] = 78;
		
	    int marks2[] = new int[4];
	    for(int i=0,k=3;i<marks1.length;i++,k--)
	    {
	    	marks2[k] = marks1[i];
	    }
	    System.out.println(Arrays.toString(marks1));
	    System.out.println(Arrays.toString(marks2));

	}

}
