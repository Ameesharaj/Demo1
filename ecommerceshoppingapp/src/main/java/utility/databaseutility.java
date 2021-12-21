package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class databaseutility {
	Connection con;
	
	/**
	 * 
	 * 
	 * 
	 * @throws SQLException
	 */

	public void connecttodatabase() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(Ipathconstants.JDBCurl, Ipathconstants.jdbcun, Ipathconstants.jdbcpwd);

	}

	public void executequeryandgetdata(String query, String expectedvalue, int colindex) throws SQLException {
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		while (result.next()) {
			String actualvalue = result.getString(colindex);

			if (expectedvalue.equalsIgnoreCase(actualvalue)) {

				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("data is present");
		} else {
			System.out.println("data is not present");
		}

	}

	public void closetheconnection() throws SQLException {
		con.close();
	}

}
