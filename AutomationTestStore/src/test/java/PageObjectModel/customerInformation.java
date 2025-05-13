package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class customerInformation {
	WebDriver driver;
	
	By removeItem = By.xpath("//i[@class='fa fa-trash']");
	
	By refreshItem = By.xpath("//i[@class='fa fa-refresh']");
	
	// Customer Details
	
	By firstName = By.xpath("//input[@name='firstname']");
	
	By lastName = By.xpath("//input[@name='lastname']");
	
	By address1 = By.xpath("//input[@name='address1']");
	
	By address2 = By.xpath("//input[@name='address2']");
	
	By postalCode = By.xpath("//input[@name='postcode']");
	
	By city = By.xpath("//input[@name='city']");
	
	By country = By.xpath("//select[@name='country_code']");
	
	By state = By.xpath("//select[@name='zone_code']");
	
	By email = By.xpath("//input[@name='email']");
	
	By phone = By.xpath("//input[@name='phone']");
	
	By saveChangeButton = By.xpath("//button[@name='save_customer_details']");
	
	
	//Confirm Order Button
	By privacyPolicy = By.xpath("//input[@name='terms_agreed']");
	By confirmOrder = By.xpath("//button[@name='confirm_order']");
	
	
	
	
	public customerInformation(WebDriver driver){
		this.driver = driver;
	}
	
	
	public WebElement getRemoveItem() {
		return driver.findElement(removeItem);
	}
	
	public WebElement getRefreshItem() {
		return driver.findElement(refreshItem);
	}
	
	//Customer Details
	public WebElement getFirstname() {
		return driver.findElement(firstName);
	}
	
	
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	
	
	public WebElement getAddress1() {
		return driver.findElement(address1);
	}
	
	public WebElement getAddress2() {
		return driver.findElement(address2);
	}
	
	public WebElement getPostalCode() {
		return driver.findElement(postalCode);
	}
	
	public WebElement getCity() {
		return driver.findElement(city);
	}
	
	public WebElement getCountry() {
		return driver.findElement(country);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPhone() {
		return driver.findElement(phone);
	}
	
	public WebElement getSaveChange() {
		return driver.findElement(saveChangeButton);
	}
	
	
	//Confirm your Order
	public WebElement getPrivacy() {
		return driver.findElement(privacyPolicy);
	}
	
	public WebElement getConfirmOrder() {
		return driver.findElement(confirmOrder);
	}
	

}
