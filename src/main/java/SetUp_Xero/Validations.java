package SetUp_Xero;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class Validations extends Base{
	
	public  void actual_Expected(String actual,String expected)
	{
		System.out.println("hello");
		if(actual.equals(expected) || actual.contains(expected)) {
			System.out.println("Pass");
			logger.log(LogStatus.PASS,"Actual and Expected  are same");
			System.out.println("Pass");
		}
		else
		{
			logger.log(LogStatus.FAIL,"Actual and Expected  are not same");
			System.out.println("fail");
		}
	}
	
	public void check_HighlightedText(WebElement element)
	{
		String color = element.getCssValue("color");

		String backcolor = element.getCssValue("background-color");

		System.out.println(color);

		System.out.println(backcolor);

		if(!color.equals(backcolor)){

		System.out.println("Text is highlighted!");

		}
	}
	public   WebElement dropDown_Displayed(WebElement dropdownElement)
	{
	 boolean dropdownPresent = dropdownElement.isDisplayed();

    if(dropdownPresent==true)
    {
        System.out.println("Dropdown is appearing");
    }
    else{
        System.out.println("Dropdown is not appearing");
    }
	//return dropdownPresent;
	return dropdownElement;

}
	public WebElement is_Displayed(WebElement ele)
	{
		boolean eleDisplayed = ele.isDisplayed();
		if( ele.isDisplayed()){

			System.out.println("Element is Visible");

			}else{

			System.out.println("Element is InVisible");
	}
		return ele;
		
}
	public void text_Present(String text)
	{
		if(driver.getPageSource().contains(text)){
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
	}
	public void is_Enabled(WebElement e)
	{
		boolean actualValue = e.isEnabled();

		if (actualValue)
		       System.out.println("Button is enabled");
		else
		       System.out.println("Button is disabled");
	}
	
}
