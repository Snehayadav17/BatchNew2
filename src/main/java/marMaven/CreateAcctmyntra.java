package marMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateAcctmyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\digital cutlt\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']"));
		act.moveToElement(link).build().perform();
		//driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
		driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("9550151707");
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		//driver.findElement(By.xpath("//input[@name='otp0']")).sendKeys("6");
		//driver.findElement(By.xpath("//input[@name='otp1']")).sendKeys("7");
		//driver.findElement(By.xpath("//input[@name='otp2']")).sendKeys("7");
		//driver.findElement(By.xpath("//input[@name='otp3']")).sendKeys("9");
		driver.findElement(By.xpath("//span[text() =' Password ']")).click();
		driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("Kirankumar@25");
		driver.findElement(By.xpath("//button[text() ='LOGIN']")).click();
		System.out.println("Logged in successfully");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement link1 = driver.findElement(By.xpath("//span[text()='Profile']"));
		act.moveToElement(link1).build().perform();
		driver.findElement(By.xpath("//div[text()=' Logout ']")).click();
		Thread.sleep(3000);
		System.out.println("Logged out successfully");
		driver.close();
		

	}

}
