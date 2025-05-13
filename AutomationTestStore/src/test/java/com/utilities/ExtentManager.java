package com.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	public static ExtentReports getExtentReports() {
		
		if(extent == null) {
			
			
			String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			reporter.config().setReportName("Automation Project Test Report");
			reporter.config().setDocumentTitle("Test Report Result");
			reporter.config().setTheme(Theme.DARK);
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Amaan Saiyed");
			
		}
		
		return extent;
		
	}

}
