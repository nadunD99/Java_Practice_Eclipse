/**
 * This is a simple programe to calculate user lived years,days,months and minites
 * @author Nadun
 * Date 2016-01-20
 * Following CS course 
 */


import java.util.Scanner;

public class AgeCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		
		int months = age * 12;
		int days = age * 365;
		int minites = days * 24 * 60;
		
		System.out.println("months you have lived : " + months);
		System.out.println("Days You have lived : " + days);
		System.out.println("Minites you have lived : " + minites);
		
		System.out.println("You are " + months+" months, or " + days+ " days, or "+ minites +" minites old.");
	}

}
