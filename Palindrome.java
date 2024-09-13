package basicsjava;

import java.util.Arrays;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String input = "MADAM";
		String output ="";
		System.out.println("Our input is " + input);
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			output = output +c1;
		}
		System.out.println("Our output is " + output);
		if(input.contains(output))
		{
			System.out.println("Our String is Palindrome");
		}

	}

}


        