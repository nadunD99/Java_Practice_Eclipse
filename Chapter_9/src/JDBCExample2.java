/**
 * This is for user input test
 * @author Nandun
 * Date- 2016-02-07
 * Time 10:31PM
 */

import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class JDBCExample2 {
	public static void main(String[] args)
	{
		int DeptNr=0;
		try{
			System.out.println("-----Loading JDBC Driver-----");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("----JDBC DRIVER LOADED Successfully-----");
						System.out.println("\n");
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		
		Scanner Key = new Scanner(System.in);
			try	{
				System.out.println("Please enter the department number");
				DeptNr = Key.nextInt();
				
			}catch(InputMismatchException err)
				{
				System.out.println("Incorrect input");
				}
			

		String url = "jdbc:mysql://localhost:3306/employeeschema";
		String username = "root";
		String password = "";
		String query = "SELECT Name,Gender,DNR" +" from employee where DNR= ? ;" ;
		
		Connection connection = null;
		Statement stmt = null;
				try{
					System.out.println("Connecting to mySQL DATABASE...");
					connection = DriverManager.getConnection(url, username, password);
					System.out.println("MySQL Databace Connected");
					System.out.println("");
					PreparedStatement psmt = connection.prepareStatement(query);
					psmt.setInt(1,DeptNr);
					ResultSet Rs = psmt.executeQuery();
					
					while(Rs.next())
						{
						System.out.print(Rs.getString(1));
						System.out.print("  ");
						System.out.print(Rs.getString(2));
						System.out.print("  ");
						System.out.print(Rs.getString(3));
						System.out.println("\n");
						
						}
						psmt.close();
					}catch(SQLException e)
				{
						System.out.println(e.toString());
				}finally {
						System.out.println("\n");
						System.out.println(".....clossing the connection...");
						if(connection != null)
								{
									try{
										connection.close();
										}catch(SQLException ignore){}
								}
						}
	}

}

/**-------------------------------How this work----------------- 
 The first part of the code is similar to the previous example. The only thing that is different is that a Scanner
object is created (using the java.util.* package) to provide input using the keyboard. The DeptNr variable
stores the number of the department for which you want to list the employees. This is accomplished using
a PreparedStatement object. This object can take parameters that are being input using the keyboard or
from a GUI application. In this example, the statement PreparedStatement
preparedStatement = connection.prepareStatement(query); creates a preparedStatement object
based upon the query string variable, which is defined as follows: String query="select Name, Gender,
DNR from employee where DNR=?";. The question mark in the query variable refers to a value that needs
to be specified before the query can be executed. In this example, this variable will be set to DeptNr (which
was obtained via the keyboard) using the following statement: preparedStatement.setInt(1, DeptNr);.
The prepared statement object can then be executed and the results stored in a resultset object using the following
statement: ResultSet rs = preparedStatement.executeQuery();. A while loop can then be
used to navigate through the results of this resultset object as in the previous example.
**/
