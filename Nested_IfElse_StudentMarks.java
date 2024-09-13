package basicsjava;

public class Nested_IfElse_StudentMarks {

	public static void main(String[] args) {
		
		int marks = 70;
		if(marks<35) {
			System.out.println("Fail");
		}
		else {
			if(marks>=35 && marks<70) {
				System.out.println("Pass");
			}
			else if(marks>=70 && marks<80 ) {
				System.out.println("Distinction");
			}
			else if(marks>=80 && marks<=100)
			{
				System.out.println("Above Average");
			}
		}
		
		
	}

}