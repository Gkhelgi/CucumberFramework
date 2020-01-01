package PageObjects_Xero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage {
	
	WebDriver driver;
	 By selectPlan=By.xpath("//div[@data-automationid='Early--radio']");
	 By continuetoBilling=By.id("continueButton");
	 By address=By.id("contactAddress");
	 By city=By.id("contactCity");
	 By clickStateList=By.xpath("//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']");
	// By selectState=By.xpath("//span[contains(text(),'California')]");
	 By selectState=By.xpath("//*[@id='California']/button/span");
	 By zCode=By.id("contactPostalCode");	
	 By continueToPay=By.xpath("//span[.='Continue to review & pay']");
	
	public BillingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getselectPlan() {
		return driver.findElement(selectPlan);

	}
	public WebElement getcontinuetoBilling() {
		return driver.findElement(continuetoBilling);

	
}
public WebElement getaddress() {
	return driver.findElement(address);


}
public WebElement getcity() {
	return driver.findElement(city);
}

	public WebElement getclickStateList() {
		return driver.findElement(clickStateList);
	}
	public WebElement getselectState() {
		return driver.findElement(selectState);
	}
	
	public WebElement getzCode() {
		return driver.findElement(zCode);
	}
	public WebElement getcontinueToPay() {
		return driver.findElement(continueToPay);
	}




}
