package PageObjects_Xero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By username=By.id("email");
	By password=By.id("password");
	By clickLogin=By.id("submitButton");
	By forgotPswd=By.className("forgot-password-advert");
	By cantLogin=By.className("cant-log-in");
	By invalidPasswordErrorMsg=By.xpath("//*[@id=\"contentTop\"]/div[2]/div[1]/div[2]/p");
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getusername() {
		return driver.findElement(username);

	}
	public WebElement getpassword() {
		return driver.findElement(password);

	
}
public WebElement getclickLogin() {
	return driver.findElement(clickLogin);


}
public WebElement getforgotPswd() {
	return driver.findElement(forgotPswd);
}

	public WebElement getcantLogin() {
		return driver.findElement(cantLogin);
	}
	public WebElement getinvalidPasswordErrorMsg() {
		return driver.findElement(invalidPasswordErrorMsg);
	}
	
}


