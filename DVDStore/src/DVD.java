
public class DVD 
{
	private String name;
	private double cost;
	boolean Avalable;
	
	public DVD(String name, double cost, boolean Avalable)
	{
	 	this.name = name;
	 	this.cost = cost;
	 	this.Avalable = Avalable;
	 	
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getCost()
	{
		return this.cost;
	}
	
	public boolean getAvalable()
	{
		return this.Avalable;
	}
	
	public void setCost(double cost)
	{
		this.cost= cost;
	}
	
	public void rent()
	{
	 this.Avalable = false;	
	}
	
	public void returnDVD()
	{
		this.Avalable = true;
	}

	
	
	

}
