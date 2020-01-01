package SetUp_Xero;
	import java.io.File;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

	public class Base {
		public WebDriver driver;
		
		public Properties prop;
		public static ExtentReports reports;
		public static ExtentTest logger;
		
		
		public WebDriver initialize_Driver() throws IOException {
			String path = "C:\\Users\\Megha\\Desktop\\Automation_Architect\\Appium\\Xero_TestCase\\Xero_ExtentReports\\Xero.html";
			reports = new ExtentReports(path);
			
			 prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\SetUp_Xero\\Xero_Data.properties");
			prop.load(fis);
			String browserName=prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
				 driver = new ChromeDriver();		
				
			}
			else
				if(browserName=="firefox") {
					System.setProperty("webdriver.firfox.driver", "C:\\Users\\Megha\\geckodriver.exe");
					 driver = new FirefoxDriver();
					
				}
				else
					if(browserName=="IE") {
						System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
						 driver = new ChromeDriver();
					}
			//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
			}
		public void getScreenshot(String result) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
			
		}


	}



