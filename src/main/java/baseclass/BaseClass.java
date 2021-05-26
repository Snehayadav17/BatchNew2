package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	public BaseClass() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\src\\eclipse-workspace\\BatchNew2\\src\\main\\java\\baseclass\\config.properties");
		prop.load(fis);
	}
	public void Initialization() throws IOException {
		BaseClass b = new BaseClass();	
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if(browser.equals("browser")) {
			System.setProperty("webdriver.chrome.driver", "D:\\digital cutlt\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equals("Edge")){
			System.setProperty("webdriver.edge.driver", "D:\\digital cutlt\\Drivers\\edgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:\\digital cutlt\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
	}
}
