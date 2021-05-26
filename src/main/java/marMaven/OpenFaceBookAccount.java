package marMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OpenFaceBookAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gsnehayadav17@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kirankumaryadav");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Account']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log Out']"))).click();
		
	
		
	}

}
