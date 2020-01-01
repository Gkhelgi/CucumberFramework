package PageObjects_Xero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
	WebDriver driver;
	By accounting=By.xpath("//button[contains(text(),'Accounting')]");
	By reports=By.xpath("//a[contains(text(),'Reports')]");
	By contacts=By.xpath("//button[contains(text(),'Contacts')]");
	By DcDropDown=By.xpath("//*[@class='xrh-icon xrh-appbutton--caret xrh-icon-svg'] ");
	By files=By.xpath("//a[contains(text(),'Files')]");
	By settings=By.xpath("//a[contains(text(),'Settings')]");
	By clickOnNew=By.xpath("//li[1]//button[1]//div[1]");
	By notifications=By.xpath("//li[3]//button[1]//div[1]");
	By search=By.xpath("//li[@class='xrh-addon xrh-addon-alwaysvisible']//div[@class='xrh-focusable--child xrh-iconwrapper']");
	By help=By.xpath(" //li[4]//button[1]//div[1]");
	
	
	
	
	
	
	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getaccounting() {
		return driver.findElement(accounting);

	}
	public WebElement getreports() {
		return driver.findElement(reports);

	
}
public WebElement getcontacts() {
	return driver.findElement(contacts);


}
public WebElement getDcDropDown() {
	return driver.findElement(DcDropDown);
}

	public WebElement getfiles() {
		return driver.findElement(files);
	}
	public WebElement getsettings() {
		return driver.findElement(settings);
	}
	public WebElement getclickOnNew() {
		return driver.findElement(clickOnNew);
	}
	public WebElement getnotifications() {
		return driver.findElement(notifications);
	}
	public WebElement getsearch() {
		return driver.findElement(search);
	}
	public WebElement gethelp() {
		return driver.findElement(help);
	}
}
