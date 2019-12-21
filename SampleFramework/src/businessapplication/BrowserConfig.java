package businessapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	static WebDriver driver;
	
	public static WebDriver openBrowser() {
		if(driver==null) {//when driver dont have a value, dont take space in memory
			System.setProperty("webdriver.chrome.driver", "/Users/monsurahamed/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
				//adjust the window to maximize size
			driver.get("http://www.bankrate.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

}
