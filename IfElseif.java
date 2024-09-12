package basics;

public class IfElseif 
{
public static void main(String[] args) 
{
	int a = 30;
	float b = 90.34f;
	long c = 75938328;
	if(a==b || b/c==40.374) //false
	{
		System.out.println("Both conditon satisfied");
	}
	else if(a!=b)  //True
	{
		System.out.println("Only this condition satisfied");
	}
	else if(a==b && b==c) // False
	{
		System.out.println("True");
	}
			
}
}
