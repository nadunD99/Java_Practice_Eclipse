
public class Dog extends Animal{
	public Dog()
	 {
		super();
		 
	 }
	
	public Dog(int a, String c)
	 {
	//super();
		this.age = a;
		 this.color = c;
		 
	 }
	
	public void sound()
	{
		System.out.println("woof");
		System.out.println(getColor());
	}

}
