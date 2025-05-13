package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IphoneCategories {
	
	WebDriver driver;
	
	By Iphone11 = By.xpath("//h4[contains(text(),'Apple iPhone 11 Pro Dummy Phone Show Model Phone E')]");
	By Iphone12 = By.xpath("//h4[contains(text(),'Apple iPhone 12 Mini Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	By Iphone13 = By.xpath("//h4[contains(text(),'Apple iPhone 13 Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	By Iphone14 = By.xpath("//h4[contains(text(),'Apple iPhone 14 Pro Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	By Iphone15 = By.xpath("//h4[contains(text(),'2023 New Apple iPhone 15 Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	By Iphone16 = By.xpath("//h4[contains(text(),'2024 New Apple iPhone 16 Pro Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	By filterProduct = By.xpath("//input[@placeholder='Filter by product name']");
	
	public IphoneCategories(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getIphone11() {
		return driver.findElement(Iphone11);
	}
	
	public WebElement getIphone12() {
		return driver.findElement(Iphone12);
		
	}
	
	public WebElement getIphone13() {
		return driver.findElement(Iphone13);
	}
	
	public WebElement getIphone14() {
		return driver.findElement(Iphone14);
	}
	
	public WebElement getIphone15() {
	return driver.findElement(Iphone15);
	}
	
	public WebElement getIphone16() {
		return driver.findElement(Iphone16);
	}
	
	public WebElement getfilter() {
		return driver.findElement(filterProduct);
	}

}
