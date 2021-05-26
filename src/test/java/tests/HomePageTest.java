package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass.TestBase;
public class HomePageTest extends TestBase {
	/*public HomePageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() throws IOException {
		Initialization();

	}

	@Test
	public void test() throws IOException {
		HomePage hom = new HomePage();
		hom.setSearch("Dresses");

	}

}*/
	@Test
	void contactUsPage_01() throws InterruptedException {
		String contactUsPageText = "CUSTOMER SERVICE - CONTACT US";
		
		homepageObj.getContactUs().click();
		Thread.sleep(5000);
		String textFromWeb = contactUsPageObj.getContactUs().getText();
		
		Assert.assertTrue(contactUsPageText.equals(textFromWeb));
		
		Assert.assertEquals(contactUsPageText, textFromWeb);
	}
	
	
	@Test
	void verifySignPage_01() {
		
		String signInPageText = "AUTHENTICATION";
		homepageObj.getSignIn().click();
		String webText = signInPageObj.getsignInPageText().getText();
		
		Assert.assertTrue(signInPageText.equals(webText));
		
	}
	
}
