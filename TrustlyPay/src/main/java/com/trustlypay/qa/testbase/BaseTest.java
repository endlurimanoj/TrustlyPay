package com.trustlypay.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.trustlypay.qa.testutil.TestUtil;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseTest() {
	try {
	prop = new Properties();
	FileInputStream ip = new FileInputStream("\\Users\\Administrator\\eclipse-workspace\\TrustlyPay\\src\\main\\java\\com\\trustlypay\\qa\\configprop\\config.Properties");
	prop.load(ip);
	
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
		
	e.printStackTrace();
	}
	}
	
	public void launchApp() {
	String browserName = prop.getProperty("browser");
	if (browserName.contains("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Desktop\\\\chromedriver.exe");
	driver=new ChromeDriver();
	}else if(browserName.contains("firefox")) {
	driver=new FirefoxDriver();
	}else if(browserName.contains("IE")) {
	driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//Implicit TimeOuts
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	//PageLoadTimeOuts
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUt,TimeUnit.SECONDS);
	//Launching the URL
	driver.get(prop.getProperty("url"));
	}


}
