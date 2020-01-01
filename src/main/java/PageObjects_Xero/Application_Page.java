package PageObjects_Xero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Application_Page {	
	
		public WebDriver driver;

		By freeTrialBtn = By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']");
		By login=By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']");
		//xpath("//a[@title='Free trial')	
		//a[@class='btn btn-primary global-ceiling-bar-btn'] 

		public  Application_Page(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
		}

		public WebElement getFreeTrailBtn() {
			return driver.findElement(freeTrialBtn);

		}
		public WebElement getLoginBtn() {
			return driver.findElement(login);

		}

}

