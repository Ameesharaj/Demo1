package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class executequery2 {
	@Test
	public  static void executequery() throws SQLException {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info","root","root");
		Statement stat=con.createStatement();

 ResultSet result = stat.executeQuery("select * from student");
 while(result.next()) {
	 System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+ "\t"+result.getString(4));
	 
 }

		con.close();
		
		
		

		
		
	}

}
