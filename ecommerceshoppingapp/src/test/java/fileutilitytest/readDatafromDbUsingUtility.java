package fileutilitytest;

import java.sql.SQLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import utility.databaseutility;

public class readDatafromDbUsingUtility {
	
	 
	
	databaseutility ref = new databaseutility();
	@BeforeTest
	public void connect() throws SQLException {
		ref.connecttodatabase();
	}
	@Test
	public void execute() throws SQLException {
		ref.executequeryandgetdata("select * from student", "dulquer", 1);
	}
	@AfterTest
	public void close() throws SQLException
	{
		ref.closetheconnection();
	}
}
	
