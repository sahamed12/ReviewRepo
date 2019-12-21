package businessapplication;

import org.openqa.selenium.WebDriver;

import db.ObjectRepo;
import db.TestData;
import utility.Helper;

public class CoreSteps {
	
	WebDriver driver;
	 CoreSteps(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyHomePage() {
		
		Helper.verifyElement(driver.findElement(ObjectRepo.logo));
		
	}
	
	public void verifyHomePageTitle () {
		Helper.verifyTitle(driver, TestData.Htitle);
	}
	
	public void hoverOveronMortgage() {
		Helper.hoverOver(driver, driver.findElement(ObjectRepo.mortgagemenu));
	}

}
