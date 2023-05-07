package com.trustlypay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trustlypay.qa.testbase.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(name="email")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement sumit;
	
	public LoginPage() {
		
	PageFactory.initElements(driver, this);
	}
	
	public String validateLoginTitle() {
	return driver.getTitle();
	} 
	public DashBoard loginpagetest(String username, String password) {
	Username.sendKeys(username);
	Password.sendKeys(password);
	sumit.click();
	return new DashBoard();
	}


}
