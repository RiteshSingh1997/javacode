package basics;

public class Palindrome_Of_String 
{

	public static void main(String[] args) 
	{
		String input = "RACECAR";
		String output = "";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			output = output + c1;
		}
		System.out.println("Our input is " + input);
		System.out.println("Our output is " + output);
		boolean b1 = input.equals(output);
		if(b1==true)
		{
		System.out.println("String is Palindrome");
		}
		else
		System.out.println("String is not Palindrome");

	}

}
