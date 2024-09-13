package basicsjava;

public class No_To_Check_In_Array 
{

	public static void main(String[] args) 
	{
		int	 student_id_1[] = new int[4];
		student_id_1[0] = 47;
		student_id_1[1] = 45;
		student_id_1[2] = 48;
		student_id_1[3] = 67;
		
		int notocheck = 48;                      // to check if number 48 is present in arrays and at which index
		for(int i=0;i<4;i++)
		{
			if(notocheck==student_id_1[i])
			{
				System.out.println("Number to check " + notocheck + " is part of array");
				System.out.println("The Array index is --> " + i);
			}
		}
		

	}

}
