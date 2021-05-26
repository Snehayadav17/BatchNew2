package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.ContactUsPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignInPage;
import project_listeners.WebEvents;

public class TestBase {
static WebDriver driver;
	
	protected HomePage homepageObj;
	protected SignInPage signInPageObj;
	protected CreateAccountPage createAccountPageObj;
	protected ContactUsPage contactUsPageObj;
	
	
	public Properties prop;
	public FileInputStream fis;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "src\\main\\java\\baseclass\\config.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if(prop.getProperty("browser").equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\digital cutlt\\Drivers\\edgedriver.exe");
			driver = new EdgeDriver();
		} 
		else if(prop.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\digital cutlt\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}		
		else {
			System.out.println("provided browser not exist");
			System.exit(0);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		WebEvents ecapture = new WebEvents();
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		eventDriver.register(ecapture);
		
		homepageObj = new HomePage(driver);
		signInPageObj = new SignInPage(driver);
		createAccountPageObj = new CreateAccountPage(driver);
		contactUsPageObj = new ContactUsPage(driver);
		
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}
	
	
	
}