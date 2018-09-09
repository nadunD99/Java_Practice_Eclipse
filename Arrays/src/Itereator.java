/**
		 * This programe is to introduce the concept of Iterater and functionning
		 * with reference to ArrayList.java class
		 * @author Nadun
		 * Date-2016-01-20
		 * Following CS course and chapter 7--(007) & (008)
		 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Itereator {

	public static void main(String[] args)
	{
			
		List<String> words = new ArrayList<String>();
				words.add("cat");
				words.add("dog");
				words.add("Rat");
				words.add("Fox");
				
				
				
		List<String> words2 = new ArrayList<String>();
				words2.add("elephant");
				words2.add("rabbit");
				words2.add("Deer");
				words2.add("eagle");
				
				Iterator it = words2.iterator();// creating iterator one to read words2
				while(it.hasNext())
				{
					String ws = (String)it.next();
					System.out.println(ws);
				}
				
				System.out.println("\n");
				
				
				words.addAll(words2);
				
				System.out.println(words);
				System.out.println("\n");
				
				System.out.println(words.size());
				
				Iterator itr = words.iterator();// creating iterator two to read words2
				while(itr.hasNext())
				{
					String str= (String)itr.next();
					//if(str.equals("deer"))
					if(str.equalsIgnoreCase("deer"))
					{
						itr.remove();
					}else{
						System.out.println(str);
						}				
					}
				
				System.out.println(words.size());
				System.out.println("\n");
				System.out.println(words);
				
				
					
				
	}
}
