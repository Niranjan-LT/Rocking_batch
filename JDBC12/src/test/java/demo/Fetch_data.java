package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Fetch_data 
{
	@Test
	void test() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/Orange_HRM";
		String un="root";
		String pass="root";
		//step 1
		Connection con = DriverManager.getConnection(url, un, pass);
		//step2
		Statement statement = con.createStatement();
		//step 3
		ResultSet List_of_data = statement.executeQuery("select * from EMP");
		
		
		while(List_of_data.next())
		{
			String lastname = List_of_data.getString("LastName");
			String first_name = List_of_data.getString("FirstName");
			String middle_name = List_of_data.getString("MiddleName");
			
			
			System.out.println(first_name+" "+middle_name+" "+lastname);

		}
		
		
		con.close();
	}

}
