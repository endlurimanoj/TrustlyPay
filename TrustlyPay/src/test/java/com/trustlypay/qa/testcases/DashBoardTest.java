package com.trustlypay.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trustlypay.qa.pages.DashBoard;
import com.trustlypay.qa.pages.LoginPage;
import com.trustlypay.qa.testbase.BaseTest;

public class DashBoardTest extends BaseTest {
	DashBoard dashboard;
	LoginPage loginpage;
	
	@BeforeMethod
	public void setUop() {
		launchApp();
		dashboard = new DashBoard();
		loginpage= new LoginPage();
		
	}
	@Test
	public void testTodayDashBoard() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.todayDashBoard();
		
	}
	@Test
	public void testYesterdayDashBoard() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.yesterdayDashBoard();
	}
	@Test
	public void testLast7DashBoard() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.last7daysDashBoard();
		
	}
	@Test
	public void testLast30DashBoard() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.last30daysDashBoard();
		
	}
	@Test
	public void testThisMonthDashBoard() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.thisMonthDashBoard();
		
	}
	@Test
	public void testLastMonthDashBoard() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.LastMonthDashBoard();
		
	}
	@Test
	public void testCustomDateDashBoard() {
		dashboard=loginpage.loginpagetest(prop.getProperty("username"), prop.getProperty("password"));
		dashboard.customRangeDashBoard();
		
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
}
