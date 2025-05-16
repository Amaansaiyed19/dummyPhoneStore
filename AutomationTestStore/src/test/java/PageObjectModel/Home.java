package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	WebDriver driver;
	
	By category = By.xpath("//a[normalize-space()='Categories']");

	By iphone = By.linkText("iPhone Dummy Phone");

	By ipadMacbook = By.linkText("iPad Macbook Dummy");

	By vivo = By.linkText("VIVO Dummy Phone");

	By samsung = By.linkText("Samsung Dummy Phone");

	By onePlus = By.linkText("OnePlus Dummy Phone");

	By oppo = By.linkText("OPPO Dummy Phone");

	By xiaomi = By.linkText("XIAOMI Dummy Phone");

	By huawei = By.linkText("Huawei Dummy Phone");

	By searchBar = By.xpath("//input[@type='search']");

	By addToCart = By.xpath("//button[contains(text(),'Add To Cart')]");

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCategory() {
		 return driver.findElement(category);

	}
	
	public WebElement getIphone() {
		 return driver.findElement(iphone);

	}

	public WebElement getIpadMacbook() {
		 return driver.findElement(ipadMacbook);

	}

	public WebElement getVivo() {
		 return driver.findElement(vivo);
	}

	public WebElement getSamsung() {
		 return driver.findElement(samsung);
	}

	public WebElement getOneplus() {
		 return driver.findElement(onePlus);
	}

	public WebElement getOppo() {
		 return driver.findElement(oppo);
	}

	public WebElement getXiaomi() {
		 return driver.findElement(xiaomi);
	}

	public WebElement getHuawei() {
		 return driver.findElement(huawei);
	}

	public WebElement getSearchbar() {
		 return driver.findElement(searchBar);
	}

	public WebElement getAddToCart() {
	return driver.findElement(addToCart);
	}
}
