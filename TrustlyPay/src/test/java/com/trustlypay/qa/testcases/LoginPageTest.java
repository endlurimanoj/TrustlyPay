package com.trustlypay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trustlypay.qa.pages.DashBoard;
import com.trustlypay.qa.pages.LoginPage;
import com.trustlypay.qa.testbase.BaseTest;

public class LoginPageTest extends BaseTest {
	
		LoginPage loginpage;
		DashBoard dashboard;
		
		@BeforeMethod
		
		public void setUp() {
		launchApp();
		loginpage=new LoginPage();
		}
		
		@Test
		public void testLoginTitle() {
		String title1=loginpage.validateLoginTitle();
		Assert.assertEquals(title1, "Trustlypay"); 
		}
		@Test
		public void logintest() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		}
		@AfterMethod
		public void tearDown() {
		driver.quit();
		}


}
