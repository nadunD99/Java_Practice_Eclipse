import java.util.Scanner;

/**
 * This code is to introduce to machanism of forloop
 * @author Nadun
 * Date 2016-01-19 (tuesday)
 *Following CS for everyone course 
 *last video of 4th chapter
 */
		
public class ForLoop {

	public static void main(String[] args)
	
	{
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter the counter value: ");
		int num = s.nextInt();
		
		for(int x= 0; x < num ; x++)
		{
			System.out.println("Hellow "+ x);
			
		}
		
		for(int n=0;n<num;n++)
		{
			System.out.println("\n");
			
			for(int i=n;i<num;i++)
			{
				System.out.print("* ");
				
		    }

	   }
		
		for(int n=0;n<num;n++)
		{
			System.out.println("\n");
			
			for(int i=n;i>0;i--)
			{
				System.out.print("* ");
				
		    }

	   }
		
		
		
		
		
	}

}
