package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class executeupdate { 
	@Test
	public void insertintotable() throws SQLException {
		Driver driverref= new Driver();
		DriverManager.registerDriver(driverref);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info","root","root");
		Statement stat=con.createStatement();
		int result=stat.executeUpdate("insert into student(name, id,age,mobile)values('amee',60,89,4556567)");
		if(result==1)
			System.out.println("query is fine");
		else 
			System.out.println("query is not fine");
		con.close();
		
			
		
			
		
		
		
	}

}
