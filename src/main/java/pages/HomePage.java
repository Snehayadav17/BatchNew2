package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class HomePage extends BaseClass{
WebDriver driver =null;
	
	public HomePage(WebDriver driver) throws IOException{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='search_query_top']") 
	private WebElement search;
	
	public void setSearch(String val) {
		search.sendKeys(val);
	}
	
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath ="//a[text() ='Contact us']")
	private WebElement contactUs;
	
	public  WebElement getContactUs() {
		return contactUs;
		
	}
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	@FindBy(xpath ="//button[@name = 'submit_search']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}


}
