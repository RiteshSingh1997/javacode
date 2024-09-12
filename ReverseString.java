package basics;
public class ReverseString 
{
public static void main(String[] args) 
{
	String input="manish"	;
	System.out.println("My Input is->"+input);
	String output="";
	for(int i=input.length()-1;i>=0;i--)
	{
		char c1=	input.charAt(i);
		output=output+c1;
	}
	System.out.println("My output is -> "+output);
	if(input.equals(output)==true)
	{
		System.out.println("It is a palindrome");
	}
	else
	{
		System.out.println("It is NOT a palindrome");
	}



}
}
