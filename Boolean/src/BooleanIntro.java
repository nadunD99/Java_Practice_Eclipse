/**This is a program written to understand boolean data type
 * @author Nadun
 *Date = 2016-01-20
 *following CS course   
 */


public class BooleanIntro
{
	public static void main(String[] args)
	{
		boolean B1=true;
		boolean B2=false;
		
		B1 = B1 && B2;
		B2 = B1 || B2;
		System.out.println(B1);
		System.out.println(B2);
		
		Boolean B3= !(B1&&B2);
		
		System.out.println(B3);
		
		/**while(!(B1&&B2) && B2 )
		{
			System.out.println("#");
		}*/
		
		while(!(B1&&B2) && B3 || B2 )
		{
			System.out.println("#");
		}
		
	}
	

}
