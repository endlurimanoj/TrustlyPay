package com.trustlypay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trustlypay.qa.testbase.BaseTest;

public class SinupPage extends BaseTest {
	Actions action = new Actions(driver);
	
		@FindBy(xpath="//a[text()='Sign Up']")
		WebElement Signup;
		
		@FindBy(id="name")
		WebElement Name;
		
		@FindBy(name="email")
		WebElement Email;
		
		@FindBy(name="mobile_no")
		WebElement Mobile;
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(name="password_confirmation")
		WebElement ConfmPass;
		
		@FindBy(xpath="//span[@class='cr show-pointer']")
		WebElement checkbox;
		
		@FindBy(xpath="//input[@value='Register']")
		WebElement Register;
		
		public SinupPage() {
			PageFactory.initElements(driver, this);
		}
		public void Register(String name, String mail, String mobile, String pass, String cnpass ) {
			action.moveToElement(Signup).build().perform();
			Signup.click();
			Name.sendKeys(name);
			Email.sendKeys(mail);
			Mobile.sendKeys(mobile);
			Password.sendKeys(pass);
			ConfmPass.sendKeys(cnpass);
			checkbox.click();
		}
		public boolean buttonEnable() {
		
			action.moveToElement(Signup).build().perform();
			Signup.click();
			action.moveToElement(Register).build().perform();
		return Register.isEnabled();
		}
		
		public void moveToSinup() {
			action.moveToElement(Register).build().perform();
			Register.submit();
		}


}
