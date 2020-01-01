package Xero_TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;


import PageObjects_Xero.Application_Page;
import PageObjects_Xero.BillingPage;
import PageObjects_Xero.DashBoardPage;
import PageObjects_Xero.LoginPage;
import PageObjects_Xero.NewOrganizationPage;
import PageObjects_Xero.Sign_Up_Page;
import SetUp_Xero.Base;
import SetUp_Xero.GetData_XL;
import SetUp_Xero.Validations;

public class Implement_Xero extends Base{
	
		
	@BeforeMethod
	public void setUp() throws IOException {
		
		driver=initialize_Driver();
		logger = reports.startTest("Browser Initiializations");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}
	
	@Test
	public void signUp_C_TC1() throws IOException, InterruptedException 
	{
		logger = reports.startTest("Xero URL launch");
		GetData_XL gd = new GetData_XL();
		 String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet1");
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		logger.log(LogStatus.PASS, "URL launched");
		Thread.sleep(4000);
		Application_Page ap=new Application_Page(driver);
		ap.getFreeTrailBtn().click();
		Thread.sleep(3000);
		logger.log(LogStatus.PASS, "Nvigated to SignUp Page ");
		String actualTitle=driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(driver.getCurrentUrl());
		Validations v=new Validations();
		v.actual_Expected(actualTitle, data[1][6]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Sign_Up_Page sp=new Sign_Up_Page(driver);
		String clockOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
		sp.gettermsLink().sendKeys(clockOnLink);
		logger.log(LogStatus.PASS, "Legal Terms page is displayed ");
		String  ChildWindow = driver.getWindowHandles().toArray()[1].toString();
		String actualTermsPage =driver.switchTo().window(ChildWindow).getCurrentUrl();
		System.out.println(actualTermsPage);
		//String actualTermsPage=driver.getCurrentUrl();
		v.actual_Expected(actualTermsPage, data[1][11]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Thread.sleep(4000);
		sp.getprivacylink().sendKeys(clockOnLink);
		logger.log(LogStatus.PASS, "Legal Terms and privacy page is displayed ");
		Thread.sleep(4000);
		String  ChildWindow2= driver.getWindowHandles().toArray()[2].toString();
		String actualPrivacyPage =driver.switchTo().window(ChildWindow2).getCurrentUrl();
		System.out.println(actualPrivacyPage);
		//String actualPrivacyPage=driver.getCurrentUrl();
		v.actual_Expected(actualPrivacyPage, data[1][12]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Thread.sleep(3000);	
		
	}
	@Test(enabled=false)	
	public void signUp_D_TC2() throws IOException, InterruptedException 
	{
		logger = reports.startTest("Xero URL launch");
		GetData_XL gd = new GetData_XL();
		 String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet1");
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		logger.log(LogStatus.PASS, "URL launched");
		Thread.sleep(4000);
		Application_Page ap=new Application_Page(driver);
		ap.getFreeTrailBtn().click();
		Thread.sleep(3000);
		logger.log(LogStatus.PASS, "Nvigated to SignUp Page ");
		String actualTitle=driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(driver.getCurrentUrl());
		Validations v=new Validations();
		v.actual_Expected(actualTitle, data[1][6]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Sign_Up_Page sp=new Sign_Up_Page(driver);
		sp.getofferDetails().click();
		String actualUrl=driver.getCurrentUrl();
		logger.log(LogStatus.PASS, "Navigated to  offer details page");
		
		//v.actual_Expected(actualUrl, data[1][11]);
		
	}
	
	@Test(enabled=false)
	public void signUp_E_TC3() throws IOException, InterruptedException 
	{
		logger = reports.startTest("Xero URL launch");
		GetData_XL gd = new GetData_XL();
		 String data[][] = gd.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet1");
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		logger.log(LogStatus.PASS, "URL launched");
		Thread.sleep(4000);
		Application_Page ap=new Application_Page(driver);
		ap.getFreeTrailBtn().click();
		Thread.sleep(3000);
		logger.log(LogStatus.PASS, "Nvigated to SignUp Page ");
		String actualTitle=driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(driver.getCurrentUrl());
		Validations v=new Validations();
		v.actual_Expected(actualTitle, data[1][6]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Sign_Up_Page sp=new Sign_Up_Page(driver);
		sp.getaccountantBookkeeperLink().click();
		logger.log(LogStatus.PASS, "Navigated to  Lets start Great patnership page");
		String actualPageUrl=driver.getCurrentUrl();
		//v.actual_Expected(actualPageUrl, data[1][13]);

}
	@Test(enabled=false)	
	public void signUp_E_TC4() throws IOException, InterruptedException 
	{
		logger = reports.startTest("Validtae the links");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet2");
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		logger.log(LogStatus.PASS, "URL launched");
		Thread.sleep(4000);
		Application_Page ap=new Application_Page(driver);
		ap.getFreeTrailBtn().click();
		Thread.sleep(3000);
		logger.log(LogStatus.PASS, "Nvigated to SignUp Page ");
		String actualTitle=driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(driver.getCurrentUrl());
		Validations v=new Validations();
		v.actual_Expected(actualTitle, data[1][1]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Sign_Up_Page sp=new Sign_Up_Page(driver);
		sp.getemail().sendKeys(data[1][4]);
		logger.log(LogStatus.PASS, "Inavlid email is entered ");
		sp.getgetStartdBtn().click();
		String ErrorMsgEmail=sp.getinvalidEmailErrorMsg().getText();
		System.out.println(ErrorMsgEmail);
		logger.log(LogStatus.PASS, "Invalid email error msg is displayed ");
}
	
	@Test(enabled=false)	
	public void signUp_E_TC5() throws IOException, InterruptedException 
	{
		logger = reports.startTest("Validate the form label text");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet2");
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		logger.log(LogStatus.PASS, "URL launched");
		Thread.sleep(4000);
		Application_Page ap=new Application_Page(driver);
		ap.getFreeTrailBtn().click();
		Thread.sleep(3000);
		logger.log(LogStatus.PASS, "Nvigated to SignUp Page ");
		String actualTitle=driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(driver.getCurrentUrl());
		Validations v=new Validations();
		v.actual_Expected(actualTitle, data[1][1]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Sign_Up_Page sp=new Sign_Up_Page(driver);
		sp.getfirstName().sendKeys(data[1][6]);
		logger.log(LogStatus.PASS, "First name enetered ");
		sp.getlastName().sendKeys(data[1][2]);
		logger.log(LogStatus.PASS, "last name enetered ");
		sp.getemail().sendKeys(data[1][7]);
		logger.log(LogStatus.PASS, "email enetered ");
		sp.getphNum().sendKeys("8584328401");
		logger.log(LogStatus.PASS, "phone number enetered ");
		Select s=new Select(sp.getselectCountry());
		s.selectByVisibleText("United States");
		logger.log(LogStatus.PASS, "country selected ");
		Thread.sleep(3000);
		//driver.switchTo().frame(sp.getiframeCaptcha());
		//sp.getcaptchaCheckBox().click();
		//driver.switchTo().defaultContent();
		//sp.gettermsCheckBox().click();
		sp.getgetStartdBtn().click();
		logger.log(LogStatus.PASS, "clicked get started ");
		v.check_HighlightedText(sp.getformLabelText());
		logger.log(LogStatus.PASS, "Form label text is highlighted");
}
	@Test(enabled=false)
	public void signUp_E_TC6() throws IOException, InterruptedException 
	{
		logger = reports.startTest("Xero sign up");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet2");
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		logger.log(LogStatus.PASS, "URL launched");
		Thread.sleep(4000);
		Application_Page ap=new Application_Page(driver);
		ap.getFreeTrailBtn().click();
		Thread.sleep(3000);
		logger.log(LogStatus.PASS, "Nvigated to SignUp Page ");
		String actualTitle=driver.getCurrentUrl();
		System.out.println(actualTitle);
		System.out.println(driver.getCurrentUrl());
		Validations v=new Validations();
		v.actual_Expected(actualTitle, data[1][1]);
		logger.log(LogStatus.PASS, "Actaul URl is same as Expected ");
		Sign_Up_Page sp=new Sign_Up_Page(driver);
		sp.getfirstName().sendKeys(data[1][6]);
		logger.log(LogStatus.PASS, "First name enetered ");
		sp.getlastName().sendKeys(data[1][2]);
		logger.log(LogStatus.PASS, "last name enetered ");
		sp.getemail().sendKeys(data[1][7]);
		logger.log(LogStatus.PASS, "email enetered ");
		sp.getphNum().sendKeys("8584328401");
		logger.log(LogStatus.PASS, "phone number enetered ");
		Select s=new Select(sp.getselectCountry());
		s.selectByVisibleText("United States");
		logger.log(LogStatus.PASS, "country selected ");
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(sp.getiframeCaptcha()));
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(sp.getcaptchaCheckBox()));
		//element.click();
		driver.switchTo().frame(sp.getiframeCaptcha());
		Thread.sleep(3000);
		sp.getcaptchaCheckBox().click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//sp.gettermsCheckBox().click();
		sp.gettermsCheckBox().click();
		sp.getgetStartdBtn().click();
		logger.log(LogStatus.PASS, "clicked get started ");
}
	@Test(enabled=false)
	public void LoginToXero_TC7() throws IOException
	{
		logger = reports.startTest("Xero sign up");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet3");
		driver.get(prop.getProperty("url"));
		Application_Page ap=new Application_Page(driver);
		Validations vd=new Validations();
		ap.getLoginBtn().click();
		logger.log(LogStatus.PASS, "Login page is displayed ");
		LoginPage lp=new LoginPage(driver);
		lp.getusername().sendKeys(data[1][1]);
		logger.log(LogStatus.PASS, "username entered ");
		lp.getpassword().sendKeys(data[1][2]);
		logger.log(LogStatus.PASS, "password enetred ");
		lp.getclickLogin().click();
		logger.log(LogStatus.PASS, "Home page of xero is displayed");
		DashBoardPage dp=new DashBoardPage(driver);
		dp.getaccounting().click();
		vd.dropDown_Displayed(dp.getaccounting());
		logger.log(LogStatus.PASS, "accounting dropdown is displayed ");
		dp.getreports().click();
		String actualReportsPage=driver.getCurrentUrl();
		
		vd.actual_Expected(actualReportsPage, data[1][3]);
		dp.getcontacts().click();
		vd.is_Displayed(dp.getcontacts());
		logger.log(LogStatus.PASS, "contacts dropdown is displayed ");
		dp.getDcDropDown().click();
		logger.log(LogStatus.PASS, "Dc dropdown is displayed ");
		
		
		dp.getsettings().click();
		logger.log(LogStatus.PASS, "clicked on settings ");
		String actualSettingsPage=driver.getCurrentUrl();		
		vd.actual_Expected(actualSettingsPage, data[1][4]);
		dp.getclickOnNew().click();
		logger.log(LogStatus.PASS, "new drop down displayed ");
		dp.getDcDropDown().click();
		logger.log(LogStatus.PASS, "DC drop down displayed ");
		dp.getfiles().click();
		logger.log(LogStatus.PASS, "Files clicked ");
		dp.getnotifications().click();
		logger.log(LogStatus.PASS, "Notifications clicked ");
		dp.getsearch().click();
		logger.log(LogStatus.PASS, "search clicked ");
		dp.gethelp().click();
		logger.log(LogStatus.PASS, "Help clicked ");		
		
	}
	@Test(enabled=false)
	public void add_Trail_Version_TC8() throws IOException, InterruptedException
	{
		logger = reports.startTest("Xero sign up");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet4");
		driver.get(prop.getProperty("url"));
		Application_Page ap=new Application_Page(driver);
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dp=new DashBoardPage(driver);
		NewOrganizationPage op=new NewOrganizationPage(driver);
		Validations vd=new Validations();
		ap.getLoginBtn().click();
		lp.getusername().sendKeys(data[1][1]);
		lp.getpassword().sendKeys(data[1][2]);
		System.out.println(lp.getpassword().getAttribute("name"));
		Thread.sleep(3000);
		lp.getclickLogin().click();
		op.getselfDropdown().click();
		op.getchangeOrganisation().click();
		op.getaddOrganization().click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());  
	  	 
		op.getaddOrganizationName().sendKeys(data[1][3]);
		op.getclickTimezoneDD().click();
		op.getselectTimeZone().click();
		op.getaddBusiness().sendKeys(data[1][6]);
		op.getprevoiusSW().click();
		op.getselectPrevoiusSW().click();
		op.getclickOnStartTrial().click();
		String actualTitle=driver.getTitle();
		vd.actual_Expected(actualTitle, data[1][2]);
		
		
}
	@Test(enabled=false)
	public void starter_plan_TC10() throws IOException, InterruptedException
	{
		logger = reports.startTest("Xero sign up");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet4");
		driver.get(prop.getProperty("url"));
		Application_Page ap=new Application_Page(driver);
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dp=new DashBoardPage(driver);
		NewOrganizationPage op=new NewOrganizationPage(driver);
		Validations vd=new Validations();
		ap.getLoginBtn().click();
		lp.getusername().sendKeys(data[1][1]);
		lp.getpassword().sendKeys(data[1][2]);
		System.out.println(lp.getpassword().getAttribute("name"));
		Thread.sleep(3000);
		lp.getclickLogin().click();
		op.getselfDropdown().click();
		op.getchangeOrganisation().click();
		Thread.sleep(2000);
		op.getaddOrganization().click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());  
	    
	  	 
		op.getaddOrganizationName().sendKeys(data[1][3]);
		op.getclickTimezoneDD().click();
		op.getselectTimeZone().click();
		op.getaddBusiness().sendKeys(data[1][6]);
		op.getprevoiusSW().click();
		op.getselectPrevoiusSW().click();
		op.getbuyNow().click();
		Thread.sleep(3000);
		//System.out.println(driver.getPageSource());
		//vd.text_Present("Select a plan");
}
	@Test(enabled=false)	
	public void paid_Version_TC9() throws IOException, InterruptedException
	{
		logger = reports.startTest("Xero sign up");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet4");
		driver.get(prop.getProperty("url"));
		Application_Page ap=new Application_Page(driver);
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dp=new DashBoardPage(driver);
		NewOrganizationPage op=new NewOrganizationPage(driver);
		Validations vd=new Validations();
		BillingPage bp=new BillingPage(driver);
		ap.getLoginBtn().click();
		lp.getusername().sendKeys(data[1][1]);
		lp.getpassword().sendKeys(data[1][2]);
		System.out.println(lp.getpassword().getAttribute("name"));
		Thread.sleep(3000);
		lp.getclickLogin().click();
		op.getselfDropdown().click();
		op.getchangeOrganisation().click();
		Thread.sleep(4000);
		op.getaddOrganization().click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());  
	  	 
		op.getaddOrganizationName().sendKeys(data[1][3]);
		Thread.sleep(2000);
		op.getclickTimezoneDD().click();
		op.getselectTimeZone().click();
		Thread.sleep(2000);
		op.getaddBusiness().sendKeys(data[1][6]);
		op.getprevoiusSW().click();
		
		op.getselectPrevoiusSW().click();
		Thread.sleep(2000);
		op.getbuyNow().click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		bp.getselectPlan().click();
		bp.getcontinuetoBilling().click();
		System.out.println(driver.getTitle());
		bp.getaddress().sendKeys(data[1][8]);
		bp.getcity().sendKeys(data[1][9]);
		//Select s=new Select(bp.getclickStateList());
		//s.selectByVisibleText("California");
		Thread.sleep(2000);
		bp.getclickStateList().click();
		bp.getselectState().click();
		bp.getzCode().sendKeys(data[1][11]);
		Thread.sleep(3000);
		bp.getcontinuetoBilling().click();
		System.out.println(driver.getTitle());
}
	@Test(enabled=false)
	public void quckbooks_users_TC11() throws IOException, InterruptedException
	{
		logger = reports.startTest("Xero sign up");
		GetData_XL gd1 = new GetData_XL();
		 String data[][] = gd1.getDataInput(prop.getProperty("XLData_Path"),"Xero_Data.xls", "Sheet4");
		driver.get(prop.getProperty("url"));
		Application_Page ap=new Application_Page(driver);
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dp=new DashBoardPage(driver);
		NewOrganizationPage op=new NewOrganizationPage(driver);
		Validations vd=new Validations();
		ap.getLoginBtn().click();
		lp.getusername().sendKeys(data[1][1]);
		lp.getpassword().sendKeys(data[1][2]);
		System.out.println(lp.getpassword().getAttribute("name"));
		Thread.sleep(3000);
		lp.getclickLogin().click();
		op.getselfDropdown().click();
		op.getchangeOrganisation().click();
		Thread.sleep(2000);
		op.getaddOrganization().click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());	
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());  
	  	 
		op.getaddOrganizationName().sendKeys(data[1][3]);
		op.getclickTimezoneDD().click();
		op.getselectTimeZone().click();
		op.getaddBusiness().sendKeys(data[1][6]);
		op.getselectBusisness().click();
		Thread.sleep(3000);
		op.getprevoiusSW().click();
		op.getselectPrevoiusSW().click();
	
		Thread.sleep(3000);
		
		op.getquckBooksCheckBox().click();
		op.getclickQuckbooks().click();
		vd.is_Enabled(op.getclickTrial());
		op.getclickConinue().click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
}
	@AfterTest
	public void tearDown1()
	{
		reports.flush();
	}
	@AfterMethod
	public void teardown2(){
		driver.close();
		
	}
}