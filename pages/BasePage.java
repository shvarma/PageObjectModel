package com.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ListenersImpl;
import com.helpers.UtilityHelper;

public class BasePage {
	
	public static EventFiringWebDriver driver;
	public String baseUrl;

	
	@BeforeClass (groups = { "SETUP" })
	public void setUp() throws IOException {
		
		UtilityHelper uhObj = new UtilityHelper();
		String browser = uhObj.getString("browser", "config.properties");
		System.out.println("setUp - " + "With browser : " + browser);
		WebDriver webdriver;
		if (browser.equals("IE"))
			webdriver = new InternetExplorerDriver();
		else  
			webdriver = new FirefoxDriver();
		driver = new EventFiringWebDriver(webdriver);
		ListenersImpl myListener = new ListenersImpl();
		driver.register(myListener);
		
		File directory = new File(".");
		String directoryPath = directory.getCanonicalPath();
		baseUrl = "file://" + directoryPath + "/ApplicationForm.htm";
		driver.get(baseUrl);
	}
	
	@AfterClass (groups = { "TEARDOWN" })
	public void tearDown()
	{
		System.out.println("tearDown");
		driver.quit();
	}
}
