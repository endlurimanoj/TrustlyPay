package com.trustlypay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trustlypay.qa.testbase.BaseTest;

public class DashBoard extends BaseTest  {
	Actions action = new Actions(driver);;
	
	@FindBy(id="dash_date_range_summary")
	WebElement Searchrange;
	
	@FindBy(xpath="(//div[@class='ranges'])[position()=6]/ul/li[text()='Today']")
	WebElement TodayDate;
	
	@FindBy(xpath="(//div[@class='ranges'])[position()=6]/ul/li[text()='Yesterday']")
	WebElement YesterDay;
	
	@FindBy(xpath="(//div[@class='ranges'])[position()=6]/ul/li[text()='Last 7 Days']")
	WebElement Lat7Days;
	
	@FindBy(xpath="(//div[@class='ranges'])[position()=6]/ul/li[text()='Last 30 Days']")
	WebElement Last30days;
	
	@FindBy(xpath="(//div[@class='ranges'])[position()=6]/ul/li[text()='This Month']")
	WebElement ThisMonth;
	
	@FindBy(xpath="(//div[@class='ranges'])[position()=6]/ul/li[text()='Last Month']")
	WebElement LastMonth;
	
	@FindBy(xpath="(//div[@class='ranges'])[position()=6]/ul/li[text()='Custom Range']")
	WebElement Customrange;
	
	public DashBoard() {
		PageFactory.initElements(driver, this);
	}
	
	public void todayDashBoard() {
		Searchrange.click();
		action.moveToElement(TodayDate).build().perform();
		TodayDate.click();
		
	}
	public void yesterdayDashBoard() {
		Searchrange.click();
		action.moveToElement(YesterDay).build().perform();
		YesterDay.click();
		
	}
	public void last7daysDashBoard() {
		Searchrange.click();
		action.moveToElement(Lat7Days).build().perform();
		Lat7Days.click();
		
	}
	public void last30daysDashBoard() {
		Searchrange.click();
		action.moveToElement(Last30days).build().perform();
		Last30days.click();
		
	}
	public void LastMonthDashBoard() {
		Searchrange.click();
		action.moveToElement(LastMonth).build().perform();
		LastMonth.click();
		
	}
	public void thisMonthDashBoard() {
		Searchrange.click();
		action.moveToElement(ThisMonth).build().perform();
		ThisMonth.click();
		
	}
	public void customRangeDashBoard() {
		Searchrange.click();
		action.moveToElement(Customrange).build().perform();
		Customrange.click();
		
	}
	

}
