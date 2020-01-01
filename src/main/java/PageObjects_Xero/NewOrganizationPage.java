package PageObjects_Xero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewOrganizationPage {
	WebDriver driver;
	
	
	By selfDropdown=By.className("xrh-appbutton--body");
	By changeOrganisation=By.xpath("//*[@id=\"header\"]/header/div/div[1]/div/div[2]/ul/li/button");
	By addOrganization=By.xpath("//*[@id=\"header\"]/header/div/div[1]/div/div[2]/div/ol/li[7]/a");
	 By formLayout=By.xpath("//div[@class='margin-bottom-large__3eVb7 xui-panel']");
	 By addName=By.xpath("//input[@data-automationid='organisation-name--input']");
	  
	By clickTimezoneDD=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/form/div[3]/div/div/div/div[2]/div/div/button/div");
    By selectTimeZone=By.xpath("//li[@id='TIMEZONE/PACIFICSTANDARDTIME']//span[@class='xui-pickitem--text']");
	By addBusiness=By.xpath(" //input[@data-automationid='industry-autocompleter--input']");
	By prevoiusSW=By.xpath("//button[@class='xui-button xui-select--button xui-select--button-no-variant xui-textcolor-faint xui-button-standard xui-button-medium xui-button-fullwidth']");
	By selectPrevoiusSW=By.className("xui-pickitem--text");
	By clickOnStartTrial=By.xpath("//button[@class='xui-button xui-actions--primary xui-actions--button-spacing xui-button-main xui-button-medium']");
	By buyNow=By.xpath("//button[@class='xui-button xui-actions--secondary xui-button-standard xui-button-medium']");
	By quckBooksCheckBox=By.xpath("//button[@title='Toggle']");
	By clickQuckbooks=By.xpath("//div[@data-automationid='conversion-software--checkbox--checkbox']");
	By selectBusisness=By.xpath("//li[@class='xui-pickitem xui-pickitem-is-hovered xui-pickitem-medium']//span[@class='xui-pickitem--text']");
	By clickContinue=By.xpath("//button[@class='xui-button xui-actions--secondary xui-button-main xui-button-medium']");
	By clickTrial =By.xpath("//button[@class='xui-button xui-actions--primary xui-actions--button-spacing xui-button-main xui-button-medium xui-button-is-disabled']");
	
	public NewOrganizationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getselfDropdown() {
		return driver.findElement(selfDropdown);

	}
	public WebElement getchangeOrganisation() {
		return driver.findElement(changeOrganisation);

	
}
public WebElement getaddOrganization() {
	return driver.findElement(addOrganization);


}
public WebElement getaddOrganizationName() {
	return driver.findElement(addName);
}

	public WebElement getclickTimezoneDD() {
		return driver.findElement(clickTimezoneDD);
	}
	public WebElement getselectTimeZone() {
		return driver.findElement(selectTimeZone);
	}
	public WebElement getaddBusiness() {
		return driver.findElement(addBusiness);
	}
	public WebElement getprevoiusSW() {
		return driver.findElement(prevoiusSW);
	}
	public WebElement getselectPrevoiusSW() {
		return driver.findElement(selectPrevoiusSW);
	}
	public WebElement getclickOnStartTrial() {
		return driver.findElement(clickOnStartTrial);
	}
	public WebElement getformLayout() {
		return driver.findElement(formLayout);
	}
	public WebElement getbuyNow() {
		return driver.findElement(buyNow);
	}
	public WebElement getquckBooksCheckBox() {
		return driver.findElement(quckBooksCheckBox);
	}
	public WebElement getclickQuckbooks() {
		return driver.findElement(clickQuckbooks);
	}
	public WebElement getselectBusisness() {
		return driver.findElement(selectBusisness);
	}
	public WebElement getclickConinue() {
		return driver.findElement(clickContinue);
	}
	public WebElement getclickTrial() {
		return driver.findElement(clickTrial);
	}
}



