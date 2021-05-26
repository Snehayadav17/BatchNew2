package marMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\digital cutlt\\Drivers\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.com");
		driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.partialLinkText("conditions ")).click();
		//driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("gsnehayadav17@gmail.com");
		//driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("12345");

	}

}
