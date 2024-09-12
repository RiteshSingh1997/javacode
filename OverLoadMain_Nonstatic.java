package basics;

public class OverLoadMain_Nonstatic 
{
  public void main(int a, int b)
  {
	  System.out.println(a*b);
  }
  
  public void main(int a, float b)
  {
	  System.out.println(a+b);
  }
  public static void main(String[] args) 
  {
	  OverLoadMain_Nonstatic N1 = new OverLoadMain_Nonstatic();
	  N1.main(56,87);
	  N1.main(67, 80.876f);
  }
}
