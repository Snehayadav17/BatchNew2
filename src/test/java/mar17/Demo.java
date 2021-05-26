package mar17;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Demo {
	WebDriver driver;
  @Test
  public void test1() {
	  Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[text()='Women']"));
		act.moveToElement(link).build().perform();
		driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();
  }

  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test
  public void test2() {
	  
	  driver.findElement(By.xpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[1]")).click();
	  String getDressName = driver.findElement(By.xpath("(//h1[contains(text(),'Faded Short Sleeve T-shirts')])[1]")).getText();
	  
	  System.out.println("Text of dress is " + getDressName);
  }

}
