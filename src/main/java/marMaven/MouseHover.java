package marMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[text()='Women']"));
		act.moveToElement(link).build().perform();
		driver.findElement(By.xpath("//a[text() ='Casual Dresses'][1]")).click();
		driver.findElement(By.xpath("//a[contains(@text,'Printed Dress')]")).click();
		

	}

}
