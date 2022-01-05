package com.crm.vtiger.dataprovider;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
public class Createorgtest {
	@BeforeTest
	public void conFigBT()
	{
		System.out.println("connect to database");

		
		
	}
	@BeforeClass
	public void conFigBC() {
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void conFigBM() {
		System.out.println("login to browser");
	}
@Test
public void conFigTT() {
	System.out.println("navigate to create organization");
	System.out.println("verify the same with assertion");
	
}
@Test
public void conFigTE() {

System.out.println("create organization with rating");
System.out.println("verify the same with assertion");

}

@AfterMethod
public void conFigAM ()
{
	System.out.println("logout the application");
	
}
@AfterClass
public void conFigAC() {
	System.out.println("close the browser ");
	
}
@AfterTest
public void conFigAT() {
	System.out.println("close the DB connection ");
	
}
	
}
**/