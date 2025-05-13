package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonLocator {
	
	WebDriver driver;
	
	By addToCart = By.xpath("//button[contains(text(),'Add To Cart')]");
	
	By backToStore = By.xpath("//i[@class='fa fa-arrow-left']");
	
	By shoppingBasket = By.xpath("//i[@class='fa fa-shopping-basket']");
	
	public CommonLocator(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(addToCart);
	}
	
	public WebElement getBackToStore() {
		return driver.findElement(backToStore);
	}
	
	public WebElement getShoppingBasket() {
		return driver.findElement(shoppingBasket);
	}

}
