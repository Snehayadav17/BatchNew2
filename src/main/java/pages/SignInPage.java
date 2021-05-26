package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
WebDriver driver =null;
	
	public SignInPage(WebDriver driver) throws IOException{
		this.driver =driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath ="//input[@id='email_create']")
			private WebElement createEmailID;
	
	
	public void setcreateEmailID(String val) {
		createEmailID.sendKeys(val);
	}
	public WebElement getcreateEmailID() {
		return createEmailID;
	}
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement createAccountButton;
	
	public WebElement getcreateAccountButton() {
		return createEmailID;
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailID;
	
	public void setEmailID(String val) {
		emailID.sendKeys(val);
	}
	
	public WebElement getEmailID() {
		return emailID;
	}
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;
	
	public void setPassword(String val) {
		password.sendKeys(val);
	}
	
	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement submitButton;
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getSignInPageText() {
		// TODO Auto-generated method stub
		return signInPageText;
	}
	
	}

	
//button[@id = 'SubmitCreate']
//input[@id = 'email']
//input[@id = 'passwd']
//button[@id='SubmitLogin']