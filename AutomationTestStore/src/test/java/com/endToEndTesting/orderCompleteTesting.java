package com.endToEndTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePage.BasePageAutomtion;
import PageObjectModel.CommonLocator;
import PageObjectModel.Home;
import PageObjectModel.customerInformation;
import PageObjectModel.ipadMacbookCategories;

@Listeners({com.listeners.TestListener.class, com.listeners.RetryListener.class})
public class orderCompleteTesting extends BasePageAutomtion {

	public orderCompleteTesting() throws IOException {
		super();
	}

	@BeforeClass
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}
	

	@Test(priority = 1)
	public void SelectProduct() throws InterruptedException {

		SoftAssert softAssert = new SoftAssert();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//div[@aria-label='Close']")).click();

		Home home = new Home(driver);
		home.getCategory().click();
		home.getIpadMacbook().click();

		// Soft Assertion: URL or breadcrumb check

		String currentUrl = driver.getCurrentUrl();
		softAssert.assertTrue(currentUrl.contains("macbook") || currentUrl.contains("ipad"),
				"URL does not indicate the correct category selected!");

		Thread.sleep(2000);

		// Comparing the Product Title

		String productTitle = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println("Product Name: " + productTitle);
		softAssert.assertTrue(productTitle.contains(productTitle), "Selected product is not a Ipad macbook");

		Thread.sleep(2000);

		// System.out.println(currentUrl);

		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void selectProductOne() throws InterruptedException {

		SoftAssert softAssert = new SoftAssert();

		ipadMacbookCategories ipad = new ipadMacbookCategories(driver);
		CommonLocator locator = new CommonLocator(driver);
		ipad.getAppleMacbook().click();

		Thread.sleep(3000);

		locator.getAddToCart().click();

		locator.getShoppingBasket().click();
		;

	}
	
	@Test(retryAnalyzer = com.listeners.RetryAnalyzer.class)
	public void testMethod() {
	    Assert.assertFalse(true); // Force fail to test retry
	}

	@Test(priority = 3)
	public void CustomerDetails() throws InterruptedException {
		
		//SoftAssert softAssert = new SoftAssert();

		customerInformation details = new customerInformation(driver);
		
		details.getFirstname().sendKeys("John");
		details.getLastName().sendKeys("Williamson");
		details.getAddress1().sendKeys("forest");
		details.getAddress2().sendKeys("Ocean Sideways");
		details.getPostalCode().sendKeys("300292");
		details.getCity().sendKeys("Land Ocean Whale");

		Select Selectcountry = new Select(details.getCountry());
		Selectcountry.selectByVisibleText("India");

		details.getEmail().sendKeys("johnW@email.com");
		details.getPhone().sendKeys("9900883201");

		Thread.sleep(3000);

		details.getSaveChange().click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		details.getPrivacy().click();
		
		//Assert.assertFalse(true);
		 
		details.getConfirmOrder().click();
		
	}

}
