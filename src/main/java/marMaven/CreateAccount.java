package marMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		
		driver.get("http://www.automationpractice.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("gsnehayadav17@gmail.com");
		//driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name ='email_create']")).sendKeys("gsnehayadav17@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//input[@name='id_gender' and  @id='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("sneha");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("yadav");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("kirankumaryadav");
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys("1  ");
		Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		month.selectByVisibleText("February ");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		year.selectByIndex(5);
		
		
		
		
				
		

	}
}
