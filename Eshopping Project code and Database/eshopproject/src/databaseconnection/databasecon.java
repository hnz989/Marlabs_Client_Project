package databaseconnection;
import java.sql.*;

public class databasecon
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auction_fraud?serverTimezone=UTC","root","admin123");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
