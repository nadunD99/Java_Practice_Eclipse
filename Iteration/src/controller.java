
public class controller {

	public static void main(String[] args) {
		Dog mi= new Dog(5,"green"); //this won't work if you didn't create constructers in dog calss 
		mi.sound();
		mi.setAge(5);
		mi.setColor("gold");
		
		Animal pi= new Animal(5, "red");
		pi.sound();
		
		Animal t= new Dog(7,"white");
		t.setAge(7);
		t.setColor("white");
		t.sound();
		
		System.out.println("\nhi... I'm mi. "+ mi.getAge()+" years old" );
		System.out.println("I'm "+ mi.getColor()+" color");
		
		System.out.println("\nhi... I'm pi. "+ pi.getAge()+" years old" );
		System.out.println("I'm "+ pi.getColor()+" color");
		
		System.out.println("\nhi... I'm t. "+ t.getAge()+" years old" );
		System.out.println("I'm "+ t.getColor()+" color");


	}

}
