/** This is a code to compare a user input number with another number
 * @author Nadun
 * Date: 2016-01-18
 * following Computer Science for Beginners learn by building 6 Java apps download in torrentz
 * 
 */

import java.util.Scanner;

public class CompareNumber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int NO = scan.nextInt();
		
		//System.out.println(NO);
		
		if(NO <100)
		{
			System.out.println(NO+" is less than 100");
			
		}else if(NO>100)
			{
				System.out.println(NO+" is greater than 100");
			
			}	else{
					System.out.println(NO+" is equel to 100");
				
					}

	}

}








	
			
