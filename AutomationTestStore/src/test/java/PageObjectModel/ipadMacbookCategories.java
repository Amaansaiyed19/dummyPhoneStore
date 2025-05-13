package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ipadMacbookCategories {
	
	WebDriver driver;
	
	By appleMacbook = By.xpath("//h4[contains(text(),'New Apple iPad 12.9 inch Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	
	public ipadMacbookCategories(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAppleMacbook() {
		return driver.findElement(appleMacbook);
	}
	
	
}
