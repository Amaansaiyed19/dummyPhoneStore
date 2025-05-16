package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import BasePage.BasePageAutomtion;

public class Screenshot extends BasePageAutomtion {

	
	public Screenshot() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String takeScreenShots(WebDriver driver, String testname) {
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		String filepath = System.getProperty("user.dir") + "/screenshots/"+ testname + " _ " + timestamp + ".png";
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File(filepath);
		
		try {
			
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Screenshot failed: " + e.getMessage());
		}
		return filepath;
	}

}
