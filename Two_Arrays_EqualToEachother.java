package basicsjava;

import java.util.Arrays;

public class Two_Arrays_Equaltoeachother 
{

	public static void main(String[] args) 
	{
		char name2[] = new char[4];
	    name2[0] = 'R';
	    name2[1] = 'I';
	    name2[2] = 'T';
	    name2[3] = 'E';
		
        
		char name1[] = new char[4];
		name1[0] = 'R';
		name1[1] = 'I';
		name1[2] = 'T';
		name1[3] = 'E';
		
		boolean b1 = Arrays.equals(name2, name1);
		if(b1==true)
		{
			System.out.println("name2 array equal to name1 array");
		}
		else
		{
			System.out.println("name2 array is not equal to name1 array");
		}
	}

}
