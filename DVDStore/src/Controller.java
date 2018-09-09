import java.util.Scanner;

public class Controller {

	private int runMenu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 to Exit ");
		System.out.println("Enter 1 to list the DVDs ");
		System.out.println("Enter 2 to rent a DVD ");
		System.out.println("Enter 3 to add a DVD ");
		System.out.print("Your choice: ");
		int choise = sc.nextInt();
		return choise;
		
	}
	public static void main(String[] args)
	{
		System.out.println(".....Welcome to our DVD Store....");
		
		Store st = new Store();
	
		Controller one = new Controller();
		Scanner in = new Scanner(System.in);
		Scanner Doublesc= new Scanner(System.in);
		int choise = -1 ;
		
		while (choise != 0){
		choise = one.runMenu();
		
				if(choise == 1)
				{
					//Display all DVDs
					System.out.println("\n");
					st.ListDVDs();
					System.out.println("\n");
				}else if(choise == 2 ){
					//rent DVD(Ask the user for DVD name)
					System.out.println("Enter the film Name: ");
					String name = in.nextLine();
					st.rentDVD(name);
					
					}else if(choise == 3 )
						{
						
						System.out.println("Enter DVD NAME ");
						String name = in.next();
						System.out.println("Enter the cost ");
						double cost = Doublesc.nextDouble();
						st.addDVD(name, cost);
						}
				
						
					
		}
		
				
	
	}

}
