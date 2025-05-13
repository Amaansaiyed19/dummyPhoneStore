package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Huawei {
	
	WebDriver driver;
	
	By huaweiPhoneLink = By.linkText(" Huawei Dummy Phone");
	
	By Mate60 = By.xpath("//h4[contains(text(),'Huawei Mate 60 Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	
	By Pro70 = By.xpath("Huawei 70 Pro Dummy Phone Show Model Phone Exhibition Model Display Model");
	
	public  Huawei(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMate60() {
		return driver.findElement(Mate60);
	}
	
	public WebElement getPro70() {
		return driver.findElement(Pro70);
	}
	
	public WebElement getHuaweiCompany() {
		return driver.findElement(huaweiPhoneLink);
	}
	
}
