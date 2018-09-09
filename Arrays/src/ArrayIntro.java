/**
 * This programe is to introduce the concept of arrays and functionning
 * @author Nadun
 * Date-2016-01-20
 * Following CS course and chapter 7
 */
public class ArrayIntro 
{

	public static void main(String[] args) 
	{
		int[] intArray = {1,2,3,4,5,65,78,90,23,45};
		
		int[] sizes= new int[5];//{0,0,0,0,0}
		
		String[] stringArray = {"Hellow","Max","Cat","Rat","Bat","Ball","Car"};
		
		String[] phrases = new String[5]; //{null,null,null,null,null}
		
		System.out.println(intArray[3]);
		System.out.println(sizes[3]);
		System.out.println(stringArray[4]);
		
		for(int i= 0; i< intArray.length; i++ )
		{
			System.out.println(intArray[i]);
		}
		
		for(int k=0; k < stringArray.length ; k++ )
		{
			System.out.println(stringArray[k]);
			
		}
		
		//phrases[1] = "tin";
		if(phrases[1] != null)
		{
			System.out.print("not Null -@ "+phrases[1]);
		}else
			{
			System.out.println("Null -@ "+ phrases[1])	;		
			}
		
		
		

	}

}
