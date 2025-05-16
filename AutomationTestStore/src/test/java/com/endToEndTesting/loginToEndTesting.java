package com.endToEndTesting;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utilities.ExcelReader;

import BasePage.BasePageAutomtion;
import PageObjectModel.CommonLocator;
import PageObjectModel.Home;
import PageObjectModel.Oppo;
import PageObjectModel.Samsung;
import PageObjectModel.login;
import PageObjectModel.xiaomi;

public class loginToEndTesting extends BasePageAutomtion {

	public loginToEndTesting() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void chromeSetup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}

	@Test(priority = 1, dataProvider = "product")
	public void searchProduct(String productName) throws InterruptedException {
		try {

			driver.findElement(By.xpath("//div[@aria-label='Close']")).click();

		} catch (Exception e) {

			System.out.println("No popup found.");
		}

		Thread.sleep(1000);
		Home home = new Home(driver);
		home.getSearchbar().clear();
		home.getSearchbar().sendKeys(productName, Keys.ENTER);
		// home.getSearchbar();

		Thread.sleep(2000);

	}

	@DataProvider(name = "product")
	public Object[][] search() throws InvalidFormatException, IOException {

		String path = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\DummyPhoneWebsite.xlsx";
		return ExcelReader.getExcelData(path, "products");

	}

	@Test(priority = 2, dependsOnMethods = "searchProduct")
	public void selectProduct() throws InterruptedException {

		Oppo oppo = new Oppo(driver);
		oppo.getFindX7().click();

		Home home = new Home(driver);

		CommonLocator locator = new CommonLocator(driver);
		home.getAddToCart().click();

		home.getCategory().click();

		Thread.sleep(3000);
		home.getSamsung().click();

	}

	@Test(priority = 3, dependsOnMethods = "selectProduct")
	public void validate() {

		// For Samsung
		String actualTitle = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println(actualTitle);

		String expectedTitle = "Samsung Dummy Phone";

		assertEquals(actualTitle, expectedTitle, "Page not found in this page");

	}

	@Test(priority = 4, dependsOnMethods = "validate")
	public void selectSamsungMobile() {

		Samsung samsung = new Samsung(driver);
		CommonLocator locator = new CommonLocator(driver);
		Home home = new Home(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

		samsung.getGalaxyS24Ultra().click();

		home.getAddToCart().click();

	}

	@Test(priority = 5)
	public void selectXiaomiMobile() throws InterruptedException {

		Home home = new Home(driver);
		CommonLocator locator = new CommonLocator(driver);

		SoftAssert xiaomiAssert = new SoftAssert();

		home.getCategory().click();
		;

		Thread.sleep(3000);

		home.getXiaomi().click();
		;

		// For Xiaomi
		String XiaomiActualTitle = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		String XiaomiExpectedTitle = "XIAOMI Dummy Phone";

		assertEquals(XiaomiActualTitle, XiaomiExpectedTitle, "Page not found in this page");

		xiaomi xiaomi = new xiaomi(driver);
		xiaomi.getMI14().click();

		String stockRemaining = driver.findElement(By.xpath("//span[@class=\"value\"]")).getText();
		System.out.println(stockRemaining);
		xiaomiAssert.assertTrue(stockRemaining.contentEquals("Temporarily Sold Out"), "");

		Thread.sleep(3000);

		home.getAddToCart().click();

		Thread.sleep(3000);

	}

	@Test(priority = 6, dependsOnMethods = "selectXiaomiMobile")
	public void addToCartXiaomi() throws InterruptedException {

		CommonLocator locator = new CommonLocator(driver);
		locator.getShoppingBasket().click();

		Thread.sleep(3000);

	}

	@Test(priority = 7, dependsOnMethods = "addToCartXiaomi")
	public void ShoppingCart() throws InterruptedException {

		Thread.sleep(3000);

		String totalPrice = driver.findElement(By.xpath("//div[@class='card-footer subtotal text-end']")).getText();
		System.out.println(totalPrice);

		Thread.sleep(3000);

		String expectedPrice = totalPrice;

		assertEquals(totalPrice, expectedPrice, "Price is wrong");

	}

	@Test(priority = 8)
	public void UserLogin() throws InterruptedException {
		Thread.sleep(3000);
		login login = new login(driver);

		CommonLocator locator = new CommonLocator(driver);

		locator.getBackToStore().click();

		login.getAccount().click();

		login.getloginEmail().click();
		login.getloginEmail().sendKeys("johnw@email.com");

		login.getloginPassword().click();
		login.getloginPassword().sendKeys("John@123");

		login.getSignButton().click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");

		driver.findElement(By.xpath("//button[@name='save_details']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//i[@class='fa fa-shopping-basket']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[9c0e146ee13b141fa7bf2790c8b4408d][quantity]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[9c0e146ee13b141fa7bf2790c8b4408d][quantity]']")).clear();
		driver.findElement(By.xpath("//input[@name='item[9c0e146ee13b141fa7bf2790c8b4408d][quantity]']")).sendKeys("2");
		driver.findElement(By.xpath("//button[@value='9c0e146ee13b141fa7bf2790c8b4408d']")).click();

		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[40e4e60e94d9fcb33f5b6eea70a03d83][quantity]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[40e4e60e94d9fcb33f5b6eea70a03d83][quantity]']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[40e4e60e94d9fcb33f5b6eea70a03d83][quantity]']")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='609bbc1ae8c3e6fd1dcf914dd199db4c']")).click();
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[609bbc1ae8c3e6fd1dcf914dd199db4c][quantity]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[609bbc1ae8c3e6fd1dcf914dd199db4c][quantity]']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='item[609bbc1ae8c3e6fd1dcf914dd199db4c][quantity]']")).sendKeys("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='40e4e60e94d9fcb33f5b6eea70a03d83']")).click();
		
		js.executeScript("window.scrollBy(0,1700)");

//		driver.findElement(By.xpath("")).click();
	}

//	@Test
//	public void BuyProduct() throws InterruptedException {
//		
//	
//		
//		
//		
//	}

//	@AfterClass
//	public void tearDown() {
//	    driver.quit();
//	}
//	

}