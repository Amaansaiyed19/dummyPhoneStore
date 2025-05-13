package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Samsung {

	WebDriver driver;

	By GalaxyA35 = By.xpath("//h4[contains(text(),'Samsung Galaxy A35 Dummy Phone Show Model Phone Exhibition Model Display Model')]");

	By GalaxyA55 = By.xpath("//h4[contains(text(),'Samsung Galaxy A55 Dummy Phone Show Model Phone Exhibition Model Display Model')]");

	By GalaxyS24 = By.xpath("//h4[contains(text(),'Samsung Galaxy S24 Dummy Phone Show Model Phone Exhibition Model Display Model')]");

	By GalaxyS24Ultra = By.xpath("//h4[contains(text(),'Samsung Galaxy S24 Ultra Dummy Phone Show Model Phone Exhibition Model Display Model')]");

	By samsungPhoneLink = By.linkText(" Samsung Dummy Phone");
	
	public Samsung(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getGalaxyA35() {
		return driver.findElement(GalaxyA35);
	}

	public WebElement getGalaxyA55() {
		return driver.findElement(GalaxyA55);
	}

	public WebElement getGalaxyS24() {
		return driver.findElement(GalaxyS24);
	}

	public WebElement getGalaxyS24Ultra() {
		return driver.findElement(GalaxyS24Ultra);
	}
	
	public WebElement getSamsungCompany() {
		return driver.findElement(samsungPhoneLink);
	}

}
