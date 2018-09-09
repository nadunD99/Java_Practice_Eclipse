/**
 * This is for practice jdbc while reading
 * "Beginning Java Programming The Object-Oriented Approach" Book
 * @author Randy
 * Date- 2016-02-07
 */

import java.sql.*;
public class JdbcExample {

	public static void main(String[] args) {
		try{
			System.out.println("Loading JDBC Driver.....");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver successfully loaded!");
		}catch(ClassNotFoundException e)
		{
			throw new RuntimeException(e);
		}
		
		String url = "jdbc:mysql://localhost:3306/employeeschema";
		String username="root";
		String password="";
		String query = "SELECT E.Name, D.DNAME"+" from employee E, department D"+" where E.DNR=D.DNR;";
		Connection connection = null;
		Statement stmt=null;
		try	{
			System.out.println("Connecting to mysql databace...");
			connection= DriverManager.getConnection(url, username, password);
			System.out.println("MySQL databace CONNECTED");
			stmt=connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
				while(rs.next())
				{
					System.out.print(rs.getString(1));
					System.out.print(" ");
					System.out.println(rs.getString(2));
				}
			stmt.close();		
			}catch(SQLException e){
				System.out.println(e.toString());
			}finally{
				System.out.println("...Closing the connection...");
				if(connection !=null){
									try{
										connection.close();
									}catch(SQLException ignore){}
									}
			}
		
	}

}
