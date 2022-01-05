package com.crm.vtiger.dataprovider;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
/**
public class Retryanalyser implements IRetryAnalyzer{
	
	private int count=0;
	private int retrycount=3;

	public boolean retry(ITestResult result) {
		while (count<retrycount)
		{
			count++;
			return true;
		}
	
		return false;
	}

}
**/