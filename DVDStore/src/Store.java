

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store 
{
	List<DVD> dvds;
	double money;
	
	public Store()
	{
		dvds = new ArrayList<DVD>();
		//testing
		System.out.println("\n");
		dvds.add(new DVD("Maze Runner", 100.00 ,true));
		dvds.add(new DVD("SPL 2 ", 100.00 ,true));
		dvds.add(new DVD("Kung Fu Killer", 100.00 ,true));
		
	}
	
	public void ListDVDs()
	{
		Iterator itr = dvds.iterator();
		while(itr.hasNext())
		{
			DVD dvd = (DVD)itr.next();
			System.out.println(dvd.getName()+" Price = "+dvd.getCost()+" is avalable "+dvd.getAvalable());
		}
		
	}
	
	public boolean rentDVD(String name)
	{
		Iterator itr = dvds.iterator();
			while(itr.hasNext())
			{
			DVD dvd = (DVD)itr.next();
				if(dvd.getName().equals(name))
					{
						if(dvd.getAvalable())
						{
							//if avalable::::: Rent
							this.money += dvd.getCost();
							dvd.rent();
							System.out.println("The dvd is already rented.\n");
							return true;
						}else{
							// if not avalable
							System.out.println("It has already taken.. Sorry!!!!");
							return false;
						}
					}
			}System.out.println("DVD is not avalable in our list. Sorry!!");
			return false;
		
	}
	
	public void addDVD(String name, double cost)
	{
			dvds.add(new DVD(name, cost, true));
	}
	
	
	
}
