package basicsjava;

import java.util.Arrays;

public class Arrays_In_Java 
{

	public static void main(String[] args) 
	{
		int student_id[] = new int[4];
		student_id[0] = 40;
		student_id[1] = 50;
		student_id[2] = 60;
		student_id[3] =70;
		
		
		String name[] = new String[4];
		name[0] = "Ritesh";
		name[1] = "Sonali";
		name[2] = "Rohit";
		name[3] = "Anita";
		
		double percentage[] = new double[4];
		percentage[0] = 56.66;
		percentage[1] = 67.86;
		percentage[2] = 78.76;
		percentage[3] = 89.36;
		
		boolean pass[] = new boolean[4];
		pass[0] = true;
		pass[1] = false;
		pass[2] = false;
		pass[3] = true;
		
		char grade[] = new char[4];
		grade[0] = 'B';
		grade[1] = 'D';
		grade[2] = 'D';
		grade[3] = 'A';
			
		for(int i=0;i<4;i++)
		{
		System.out.println("Name is " + name[i] + ", Roll no is " + student_id[i] + ", percentage is " + percentage[i] + ", Pass " + pass[i] + ", grade is " + grade[i]);
			
		}

	}

}
