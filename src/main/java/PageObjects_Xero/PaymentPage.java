package PageObjects_Xero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
	WebDriver driver;
	 By creditCard=By.linkText("Credit card");
	 By cardNumber=By.id("stripe-card-number");
	
	public PaymentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getcreditCard() {
		return driver.findElement(creditCard);

	}
	public WebElement getcardNumber() {
		return driver.findElement(cardNumber);

	
}


}
