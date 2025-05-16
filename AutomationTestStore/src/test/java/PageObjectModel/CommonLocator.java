package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonLocator {
	
	WebDriver driver;
	
	By backToStore = By.xpath("//a[@class='btn btn-default btn-lg']");
	
	By shoppingBasket = By.xpath("//a[@id='cart']");
	
	public CommonLocator(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBackToStore() {
		return driver.findElement(backToStore);
	}
	
	public WebElement getShoppingBasket() {
		return driver.findElement(shoppingBasket);
	}

}
