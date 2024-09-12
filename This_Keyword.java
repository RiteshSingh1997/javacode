package basics;

public class This_Keyword 
{
  int length = 60;
  float width = 64.468f;
  String Name = "Ritesh Singh";
  
  public void UpdateValue(int length, float width, String Name)
  {
	  this.length = length;
	  this.width  = width;
	  this.Name = Name;
  }
  public static void main(String[] args) 
  {
	  This_Keyword N1 = new This_Keyword();
	  N1.UpdateValue(70, 568.80f, "Sonali Singh");
	  System.out.println(N1.length);
	  System.out.println(N1.width);
	  System.out.println(N1.Name);
  }
  
}
