package basicsjava;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args) 
	{
		String name1 = "Angel";
		String name2 = "Angle";
		char c1[] = name1.toCharArray();
		char c2[] = name2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("name1 in sorted manner is " + Arrays.toString(c1));
		System.out.println("name2 in sorted manner is " + Arrays.toString(c2));
		boolean b1 = Arrays.equals(c1, c2);
			if(b1==true)
			{
				System.out.println("They are Anagram");
			}
			else
			{
				System.out.println("They are not anagram");
			}

	}

}
