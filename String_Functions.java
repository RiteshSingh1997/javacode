package basicsjava;

public class String_Functions 
{

	public static void main(String[] args) 
	{
		String s1 = "Ritesh Singh";
		System.out.println("Length of String s1 is " + s1.length());            // length string function
		boolean b1 = s1.length()==12;
		System.out.println(b1);
		
		String s2 = "Sonali Singh";
		System.out.println(s2.toUpperCase());                                  // toUpper
		System.out.println(s2.toLowerCase());                                  // toLower
		
		String s3 = "  Ritesh Singh      ";
		String s4 =  s3.trim();                                // trim - Removing spaces from front and end of string but not middle
		System.out.println(s4);
		
		String s5 = "I am a Boy";
		String s6 = s5.substring(6);                           // substring single parameter
		System.out.println(s6);
		String s7 = s5.substring(2, 8);                        // substring double parameter - start and end-1
		System.out.println(s7);
		
		String s8 = "Narendra Singh";
		String s9 = "narendra sIngh";
		boolean b2 = s8.equals(s9);                           // equals should be exactly same then only boolean will be true 
		System.out.println(b2);
		
		boolean b3 = s8.equalsIgnoreCase(s9);          //equalsIgnoreCase will ignore the case and boolean will be true if string is same
		System.out.println(b3);
		
		String s10 = "Anita";
		String s11 = " Singh";
		System.out.println(s10.concat(s11));                   // concat - combining the strings
		
		String s12 = "Sonali Singh";
		String s13 = s12.replace('i','e');                       // replace - replacing the String
		System.out.println(s13);
		
		String s14 = s12.replaceAll(s12, "Ritesh Singh");          // replaceAll  
		System.out.println(s14);
		
		String Profile = "My DesignatioN Is Quality AnalysT 2";     // replaceAll -removing all alphabets with capital letter
		String s15 = Profile.replaceAll("[A-Z]","");
		System.out.println(s15);
		
		String P1 = "my designation is quality analyst 2";     // replaceAll -removing all alphabets used- replace [a-z] with nothing ""
		String s16 = P1.replaceAll("[a-z]","");
		System.out.println(s16);
		
		String P2 = "50 cent";                                 // replaceAll -removing all numbers used- replace [0-9] with nothing ""
		String s17 = P2.replaceAll("[0-9]","");
		System.out.println(s17);
		
		String P3 = "50 cent Camilo cabello";                  // replaceAll -removing all spaces involved- replace space with nothing
		String s18 = P3.replaceAll(" ","");
		System.out.println(s18);
		
		String p4 = "My Name is Ritesh";
		boolean b5 =p4.contains("Name");                      // contains - if String contains that value return True value
		System.out.println(b5);
		
		String p5 = "Ritesh";
		boolean b6 = p5.matches("(.*)h");                     // (.*)used for multicharacter search 
		System.out.println(b6);                               // matches - to check if given string ends with h
		
		String p6 = "Ritesh";
		boolean b7 = p6.matches("R(.*)");                     // (.*)used for multicharacter search 
		System.out.println(b7);                               // matches - to check if given string starts with R
		
		String p7 = "Sona";
		boolean b8 = p7.matches("(.*)a(.*)");                 // In a given String to check if a is present or not 
		System.out.println(b8);
      
		String p8 = "Sonal";
		boolean b9 = p8.matches(".....");                 // To check if a given String has exact 5 letters or not
		System.out.println(b9);
		
		String p9 = "aman";
		char c1 = p9.charAt(3);                             // charAt(index) will give the index value of string
		System.out.println(c1);
		
		String name = "Manish";
		System.out.println(name.repeat(10));                // repeat will repeat the output that times.
		
		String name1 = "Ritesh Singh  5657";
		     String []c6 =  name1.split("   ");
	}

}
