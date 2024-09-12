package basics;

abstract class Facebook_API
{
	abstract void fb_login();
	abstract void fb_registration();
}

abstract class Google_API extends Facebook_API
{
	abstract void google_login();
	abstract void google_registration();
}
public class AbstractClass extends Google_API
{

	void google_login() 
	{
		
		System.out.println("Press 1 for google account login");
	}

	void google_registration() 
	{
		
		
	}
	void fb_login() 
	{
		System.out.println("Press 2 for fb account login");
		
	}

	void fb_registration() 
	{
		
		
	}
      public static void main(String[] args) 
      {
    	  AbstractClass n1 = new AbstractClass();	 
          n1.fb_login();
          n1.fb_registration();
          n1.google_login();
          n1.google_registration();
      }
}
