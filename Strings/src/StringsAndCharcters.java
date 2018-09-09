/** This is a code to Into about strings
 * @author Nadun
 * Date = 2016-01-20
 */

public class StringsAndCharcters {

	public static void main(String[] args) 
	{
		String Hellow="Hellow, World..!";
		String test= "This is a test";
		
		System.out.println(Hellow+" "+test+" :-)");
		
		System.out.println(Hellow.equals(test));
		System.out.println(Hellow.equals("Hellow, World..!"));
		System.out.println(test.equals(test));
		
		//String sub = Hellow.substring(0, 5).toLowerCase().toUpperCase();
		String sub = Hellow.substring(0, 10).toLowerCase().toUpperCase().toLowerCase();
		
		System.out.println(sub);
		sub = sub.toUpperCase();
		System.out.println(sub);
		String sub2 =sub.toLowerCase();
		System.out.println(sub2);
		
		
		

	}

}
