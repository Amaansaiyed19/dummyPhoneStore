package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Oppo {
	
	WebDriver driver;
	
	By findX7 = By.xpath("//h4[contains(text(),'OPPO FIND X7 Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	By oppoPhoneLink = By.linkText(" OPPO Dummy Phone");
	
	public Oppo(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFindX7() {
		return driver.findElement(findX7);
	}
	
	
	public WebElement getOppoCompany() {
		return driver.findElement(oppoPhoneLink);
	}
	

}
