package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	
	WebDriver driver;
	
	By account = By.xpath("//a[@class='account text-center']");
	
	By loginEmail = By.xpath("//input[@autocomplete='email']");
	
	By loginPassword = By.xpath("//input[@autocomplete='current-password']");
	
	By  loginSignButton = By.xpath("//p//button[@value='Sign In']");
	
	public login(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAccount() {
		return driver.findElement(account);
	}
	
	public WebElement getloginEmail() {
		return driver.findElement(loginEmail);
	}
	
	public WebElement getloginPassword() {
		return driver.findElement(loginPassword);
	}
	
	public WebElement getSignButton() {
		return driver.findElement(loginSignButton);
	}
	

}
