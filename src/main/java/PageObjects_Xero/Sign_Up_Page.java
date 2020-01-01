package PageObjects_Xero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_Up_Page {
	WebDriver driver;
	
	By pageTitle=By.xpath("//h2[@class='title title-2']");
	By firstName=By.name("FirstName");
	By lastName=By.name("LastName");
	By email=By.name("EmailAddress");
	By phNum=By.name("PhoneNumber");
	By selectCountry=By.name("LocationCode");
	By termsCheckBox=By.name("TermsAccepted");
	//By captchaCheckBox=By.className("recaptcha-checkbox-checkmark");
	By captchaCheckBox=By.id("recaptcha-anchor");
	By getStartdBtn=By.className("g-recaptcha-submit");
	By accountantBookkeeperLink=By.xpath("//a[contains(text(),'accountant or bookkeeper')]");
	By offerDetails=By.xpath("//a[contains(text(),'offer details')]");
	By termsLink=By.xpath("//a[contains(text(),'terms')]");
	By privacylink=By.xpath(" //a[contains(text(),'privacy')]");
	By invalidEmailErrorMsg=By.id("signup-form-error-message-3");
	By formLabelText=By.xpath("//label[@class='form-label text']");
	By searchFieldArea=By.id("DemoOrgNotification");
	//By iframeCaptcha=By.xpath("//*[@id='rc-anchor-alert']");
	//By iframeCaptcha=By.name("a-lbtvb3jvc9m4");
	    By iframeCaptcha=By.name("a-aqd9plzdqdq3");
	   // By iframeCaptcha=By.id("rc-anchor-container");
			
	public Sign_Up_Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getPageTitle() {
		return driver.findElement(pageTitle);

	}
	public WebElement getfirstName() {
		return driver.findElement(firstName);

	}
	public WebElement getlastName() {
		return driver.findElement(lastName);

	}
	public WebElement getemail() {
		return driver.findElement(email);

	}
	public WebElement getphNum() {
		return driver.findElement(phNum);

	}
	
	public WebElement getselectCountry() {
		return driver.findElement(selectCountry);

	}
	public WebElement gettermsCheckBox() {
		return driver.findElement(termsCheckBox);

	}
	public WebElement getcaptchaCheckBox() {
		return driver.findElement(captchaCheckBox);

	}
	public WebElement getgetStartdBtn() {
		return driver.findElement(getStartdBtn);

	}
	public WebElement getaccountantBookkeeperLink() {
		return driver.findElement(accountantBookkeeperLink);

	}
	public WebElement getofferDetails() {
		return driver.findElement(offerDetails);

	}
	public WebElement gettermsLink() {
		return driver.findElement(termsLink);

	}
	public WebElement getprivacylink() {
		return driver.findElement(privacylink);

	}
	public WebElement getinvalidEmailErrorMsg() {
		return driver.findElement(invalidEmailErrorMsg);

	}
	public WebElement getformLabelText() {
		return driver.findElement(formLabelText);

	}
	public WebElement getiframeCaptcha() {
		return driver.findElement(iframeCaptcha);

	}
	public WebElement getsearchFieldArea() {
		return driver.findElement(searchFieldArea);

	}
	
	
	

}
