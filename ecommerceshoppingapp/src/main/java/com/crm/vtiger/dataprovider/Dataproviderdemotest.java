package com.crm.vtiger.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemotest {   
	
@Test(dataProvider="bookticketdataprovider")
public void ticketbooking(String src,String dest) {
	System.out.println("ticket booking confirmed from "+  src+ " to"+dest);
	System.out.println("have a safe journey");
	
}



@DataProvider Object[][] bookTicketDataprovider() {
	Object[][]objarr=new Object[5][2];
	objarr[0][0]="chennai";
	objarr[0][1]="bangalore";
	
	objarr[1][0]="chennai";
	objarr[1][1]="mysore";
	
	objarr[2][0]="chennai";
	objarr[2][1]="mumbai";
	
	objarr[3][0]="chennai";
	objarr[3][1]="kerala";
	
	objarr[4][0]="chennai";
	objarr[4][1]="pune";
	
	return objarr;
	
}
}
