package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Huawei {
	
	WebDriver driver;
	
	By huaweiPhoneLink = By.linkText(" Huawei Dummy Phone");
	
	By Mate60 = By.xpath("//h4[contains(text(),'Huawei Mate 60 Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	
	By Pro70 = By.xpath("//h4[contains(text(),'Huawei 70 Pro Dummy Phone Show Model Phone Exhibition Model Display Model')]");
	
	public  Huawei(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getMate60() {
		 driver.findElement(Mate60).click();
	}
	
	public void getPro70() {
		 driver.findElement(Pro70).click();
	}
	
	public void getHuaweiCompany() {
		 driver.findElement(huaweiPhoneLink).click();
	}
	
}
