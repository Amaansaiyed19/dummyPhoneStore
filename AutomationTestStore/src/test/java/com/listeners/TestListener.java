package com.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.utilities.ExtentManager;
import com.utilities.Screenshot;

import BasePage.BasePageAutomtion;

public class TestListener extends BasePageAutomtion implements ITestListener {

	ExtentReports extent = ExtentManager.getExtentReports();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	public TestListener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
		test.set(extentTest);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.get().log(Status.PASS, "Test Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		String testName = result.getName();

		String screenshotsPath = Screenshot.takeScreenShots(driver, testName);
		ITestListener.super.onTestFailure(result);

		System.out.println("test failed " + testName + "Screenshots saved at: " + screenshotsPath);
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
}
