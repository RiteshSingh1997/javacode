package basicsjava;

import java.util.Arrays;

public class Character_Class 
{

	public static void main(String[] args) 
	{   
		int count_of_alphabet = 0;
		int count_of_numbers = 0;
		int count_of_spaces = 0;
		String s1 = "Rites5 s*ingh2356@# 787888";
		char[] c1 = s1.toCharArray();
		System.out.println(Arrays.toString(c1));               //Printing string in arrays
		
		for(int i=0;i<s1.length();i++)
		{
		 boolean b1 = Character.isLetter(c1[i]);               // Character.isLetter for alphabets
		 if(b1==true)
		 {
			count_of_alphabet++;
		 }
		}
		System.out.println("The count of alphabets are " + count_of_alphabet);
		
		for(int i=0;i<s1.length();i++)
		{
		 boolean b2 = Character.isDigit(c1[i]);                  // Character.isdigit for numbers
		 if(b2==true)
		 {
			 count_of_numbers++;
		 }
		}
		System.out.println("The count of numbers are " + count_of_numbers);
		
		for(int i=0;i<s1.length();i++)
		{
		 boolean b3 = Character.isWhitespace(c1[i]);            // Character.isWhitespace for spaces
		 if(b3==true)
		 {
			 count_of_spaces++;
		 }
		}
		System.out.println("The count of spaces are " + count_of_spaces);
		System.out.println("Count of special characters is--> " + (s1.length()-(count_of_alphabet+count_of_numbers+count_of_spaces)));

	}

}
