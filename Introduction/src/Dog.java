
public class Dog {
	private String color;
	private int age;
	private String food;
	
	public Dog(String inputfood, int Dage, String Dcolor)
	{
		color = Dcolor;
		age = Dage;
		food  = inputfood;
	}
	



	public void eat()
	{
		System.out.println("I'm eating "+ food);
		
	}
	
	private void barkonce()
	{
		System.out.println("woof");
	}
	
	public void bark()
	{
	barkonce();
	barkonce();
		
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getcolor()
	{
		return color;
	}
}
