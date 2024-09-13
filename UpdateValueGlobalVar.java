package basicsjava;

public class UpdateValueGlobalVar 
{
   static String Name = "Ram Kumar";
   long Ritesh_Salary = 40000;
   double PI= 3.1;
   public static void main(String[] args) 
  {
	Name = "Ram Lakhan";
	System.out.println(Name);
	UpdateValueGlobalVar N1 = new UpdateValueGlobalVar();
	N1.Ritesh_Salary= 42000;
	System.out.println(N1.Ritesh_Salary);
	N1.PI= 3.14;
	System.out.println(N1.PI);
	System.out.println(N1.Ritesh_Salary+N1.PI);
	
  }
}
