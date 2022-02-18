bv package com.crm.vtiger.dataprovider;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Baseclass;
/**
public class Listner extends Baseclass implements ITestListener {

	public void onTestStart(ITestResult result)
	{
		try {
			web.takeScreenshot(Baseclass.swd ,result.getName()+ju.getSysDate());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
**/
