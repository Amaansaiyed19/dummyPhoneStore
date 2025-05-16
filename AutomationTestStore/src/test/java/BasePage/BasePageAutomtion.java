package BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePageAutomtion {

	public static WebDriver driver;
	private String url;
	private Properties properties;

	public BasePageAutomtion() throws IOException {

		properties = new Properties();

		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\resources\\config.properties");

		properties.load(data);

	}

	public WebDriver getDriver() throws IOException {

		properties = new Properties();

		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\resources\\config.properties");

		properties.load(data);

		if (properties.getProperty("browser").equals("chrome")) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (properties.getProperty("browser").equals("edge")) {

			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}

		else if (properties.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		else {
			System.out.println("Driver not found !");
		}

		return driver;
	}

	public String getUrl() {
		url = properties.getProperty("url");
		return url;
	}

}
