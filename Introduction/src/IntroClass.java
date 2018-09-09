import java.util.Scanner;

public class IntroClass {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What food does carlie likes to eat ");
		String carliefood = scan.nextLine();
		System.out.print("What is carlie age ");
		int carlieage = scan.nextInt();	//newline character...
		scan.nextLine(); //fix
		
		System.out.print("What food does berney likes to eat");
		String berneyfood = scan.nextLine();
		System.out.print("What is carlie age ");
		int berneyage = scan.nextInt();
		
		
		Dog carlie = new Dog(carliefood,carlieage,"Red");
		Dog berney = new Dog(berneyfood,berneyage,"black");
		carlie.bark();
		carlie.eat();
		berney.eat();
		
		int Dcarlieage = carlie.getAge();
		System.out.println("carlie age = "+ Dcarlieage);
		
		int Dberneyage = berney.getAge();
		System.out.println("berney age = "+ Dberneyage);
		
		String DCcolor = carlie.getcolor();
		System.out.println("carlie colour "+DCcolor);
		String DBcolor = berney.getcolor();
		System.out.println("berney colour "+DBcolor);
		
		
 
	}

}
