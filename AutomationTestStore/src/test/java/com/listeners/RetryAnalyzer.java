package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetry = 1;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (retryCount < maxRetry) {

			retryCount++;

			System.out.println("Retrying test: " + result.getName() + "| Attempt made: " + retryCount);
			return true;
		}
		return false;
	}

}
