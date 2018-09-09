import java.util.ArrayList;
import java.util.List;

/**
 * This programe is to introduce the concept of ArrayLists and functionning
 * @author Nadun
 * Date-2016-01-20
 * Following CS course and chapter 7
 */

public class ArrayLists {

	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<String>();
		words.add("cat");
		words.add("dog");
		words.add("Rat");
		words.add("Fox");
		
		List<String> words2 = new ArrayList<String>();
		words.add("elephant");
		words.add("rabbit");
		words.add("Deer");
		words.add("eagle");
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(new Integer(10));
		numbers.add(15);
		numbers.add(20);
		
		//================================================================================
		
		System.out.println(words);
		System.out.println( "\n"+words.get(0) + "\n" + words.get(1) + "\n" + words.get(2) +"\n"+words.get(3)+"\n" );
		
		for(int i= 0;i < words.size() ; i++)
		{
			System.out.println(words.get(i));
		}
		System.out.println("\n");
		
		//===============================================================================
		
		System.out.println(numbers);
		
		System.out.println( "\n"+numbers.get(0) + "\n" + numbers.get(1) + "\n" + numbers.get(2) +"\n"+numbers.get(3)+"\n" );
		
		for(int i= 0;i < numbers.size() ; i++)
		{
			System.out.println(numbers.get(i));
		}
		System.out.println("\n");
		
		//===============================================================================
		
		
		words.addAll(words2); //add two lists into one list
		System.out.println(words);
		for(int k= 0;k< words.size() ; k++)
		{
			System.out.println(words.get(k));
		}
		System.out.print("\n");
		
		System.out.println(words.isEmpty());
		System.out.println(words.hashCode());
		
		List<Integer> No1 = new ArrayList<Integer>(); 
		
		System.out.println(No1.isEmpty());
		
		
		
		
		
		
		


	}

}
