package basicsjava;

import java.util.Date;

public class String_Date_Class 
{   
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		//Epoch Coverter
		Date d2 = new Date(d1.getTime() - (1000*60*60*24*3));           //To covert the time in human understandable language
		System.out.println(d2);
		String current_time = d2.toString();
		String year = current_time.substring(current_time.length()-4);
		System.out.println(year);
		String month = current_time.substring(4, 7);
		System.out.println(month);
		String time = current_time.substring(11, 19);
		System.out.println(time);

	}
	
}
