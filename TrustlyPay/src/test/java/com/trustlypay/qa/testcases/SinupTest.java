package com.trustlypay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trustlypay.qa.pages.SinupPage;
import com.trustlypay.qa.testbase.BaseTest;

public class SinupTest extends BaseTest {
	SinupPage signuppage;
	
	@BeforeMethod
	public void setUp() {
		launchApp();
		signuppage=new SinupPage();
	}
	@Test
	public void registerButtontest() {
		boolean flag =signuppage.buttonEnable();
		Assert.assertTrue(flag);
	}
	@Test(dependsOnMethods = { "registerButtontest" })
	public void registration() {
		signuppage.Register(prop.getProperty("name"), prop.getProperty("mail"), prop.getProperty("mobile"), prop.getProperty("pass"), prop.getProperty("cnpass"));
		signuppage.moveToSinup();
	}
	@AfterMethod
		public void tearDown() {
		driver.quit();
	}


}
