package marMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mar8OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("gsnehayadav17@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'passwd']")).sendKeys("12345");
		

	}

}
