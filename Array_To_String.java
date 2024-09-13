package basicsjava;

import java.util.Arrays;

public class Array_To_String 
{

	public static void main(String[] args) 
	{
		int	 student_id_1[] = new int[4];                        // int datatype array
		student_id_1[0] = 47;
		student_id_1[1] = 45;
		student_id_1[2] = 48;
		student_id_1[3] = 67;
		
		String name = "Ritesh";                               // string datatype array
		char c1[] = name.toCharArray();
		
		System.out.println(Arrays.toString(student_id_1));      // to print array in horizantal line
		System.out.println(Arrays.toString(c1));                // to print array in horizantal line

	}

}
