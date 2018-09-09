/**This class introduce the concept of while loop
 * @author Nadun
 * date: 2016-01-18
  */

import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of times u want to print word \"Hellow\" ");
		int input = scan.nextInt();
		
		int x = 0;
		
		while(x < input){
					System.out.println(x + " Hellow  " + (x+1));
					x++;
			
					}
		
		
	}

}
