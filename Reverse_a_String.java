package basicsjava;

public class Reverse_a_String 
{

	public static void main(String[] args) 
	{
		String input = "Ritesh";
		System.out.println("My input is "+ input);
		String output = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
		System.out.println("My output is " + output);

	}

}
