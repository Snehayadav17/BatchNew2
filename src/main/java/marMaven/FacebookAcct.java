package marMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAcct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gsnehayadav17@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("kirankumaryadav");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();

	}

}
