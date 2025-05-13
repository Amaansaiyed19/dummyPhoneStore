package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xiaomi {
	
	WebDriver driver;
	
	By MI14 = By.xpath("XIAOMI 14 mobile phone Show Model Phone Exhibition Model Display Model (copy)");
	
	public xiaomi(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMI14() {
		return driver.findElement(By.xpath("//h4[@class='name']"));
	}

}
