package basics;

import java.util.Arrays;

public class Two_Arrays_EqualToEachother 

{
	public static void main(String[] args) 
	
	{
		char name1[] = new char[4];
		name1[0] = 'A';
		name1[1] = 'B';
		name1[2] = 'C';
		name1[3] = 'D';
		
		char name2[] = new char[4];
		name2[0] = 'A';
		name2[1] = 'B';
		name2[2] = 'C';
		name2[3] = 'D';
		
		boolean b1 = Arrays.equals(name1, name2);
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(name2));
		System.out.println(b1);
		
		String name3[] = new String[4];
		name3[0] = "Ritesh";
		name3[1] = "Sonali";
		name3[2] = "Rohit";
		name3[3] = "Anita";
		
		String name4[] = new String[4];
		name4[0] = "Ritesh";
		name4[1] = "Sonali";
		name4[2] = "Rohit";
		name4[3] = "Anita";
		
		boolean b2 = Arrays.equals(name3, name4);
		System.out.println(Arrays.toString(name3));
		System.out.println(Arrays.toString(name4));
		System.out.println(b2);
	}

}
